package com.github.care.wx.mp.security;


import com.github.care.wx.mp.constants.ConfigConstants;
import com.github.care.wx.mp.constants.LoginType;
import com.github.care.wx.mp.domain.base.LoginUser;
import com.github.care.wx.mp.error.ErrorCode;
import com.github.care.wx.mp.error.ErrorCodeException;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-12 15:21
 **/
@Component
public class UserLoginInterceptor extends HandlerInterceptorAdapter {
    private static final Map<Object, Login> caches = new ConcurrentHashMap<>();
    /**
     * 默认的访问权限
     */
    private final static Login DEFAULT_USER_ACCESS = new Login() {

        @Override
        public Class<? extends Annotation> annotationType() {
            return Login.class;
        }

        @Override
        public LoginType[] value() {
            return new LoginType[]{LoginType.VISITOR};
        }

    };

    /**
     * 包含某种权限
     *
     * @param access
     * @return
     */
    private boolean contains(Login access, LoginType loginType) {

        for (LoginType t : access.value()) {
            if (t == loginType) {
                return true;
            }
        }

        return false;
    }

    /**
     * 获取当前handler的访问权限
     *
     * @param handler
     * @return
     */
    private Login getUserAccess(Object handler) {

        Login access = caches.get(handler);
        if (access == null) {
            // 木有命中，找一下下
            access = findAccess(handler);
            if (access == null || access.value().length == 0) {
                access = DEFAULT_USER_ACCESS;
            }
            this.caches.put(handler, access);
        }

        return access;
    }

    /**
     * 先找方法上的, 再找类上的,最后找包上的注解
     *
     * @param handler
     * @return
     */
    private Login findAccess(Object handler) {
        Login access = null;
        if (handler instanceof HandlerMethod) {
            Method handlerMethod = ((HandlerMethod) handler).getMethod();
            // 先找method级别
            access = AnnotationUtils.getAnnotation(handlerMethod, Login.class);
            if (access == null) {
                // 再找class
                Class<?> clazz = handlerMethod.getDeclaringClass();
                access = AnnotationUtils.findAnnotation(clazz, Login.class);
                if (access == null) {
                    // 最后找找package
                    Package pg = clazz.getPackage();
                    access = pg.getAnnotation(Login.class);
                }
            }
        } else {
            access = AnnotationUtils.findAnnotation(handler.getClass(), Login.class);
        }

        return access;
    }


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LoginUser loginUser =
            (LoginUser)request.getSession().getAttribute(ConfigConstants.LOGIN_SESSION.getComment());
        check(loginUser, request, handler);
        return true;
    }

    private void check(LoginUser loginUser, HttpServletRequest request, Object handler) {

        Login access = getUserAccess(handler);

        // 如果包含访客权限，则通过
        if (contains(access, LoginType.VISITOR)) {
            return;
        }
        if(loginUser == null){
            throw new ErrorCodeException(ErrorCode.LOGIN_NO_ERR);
        }
        if (!contains(access, loginUser.getLoginType())) {
            throw new ErrorCodeException(ErrorCode.LOGIN_POWER_ERR);
        }


    }

}
