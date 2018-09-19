package com.github.care.wx.mp.controller.base;

import com.github.care.wx.mp.constants.ConfigConstants;
import com.github.care.wx.mp.constants.LoginType;
import com.github.care.wx.mp.dao.entity.User;
import com.github.care.wx.mp.domain.base.LoginUser;
import com.github.care.wx.mp.error.ErrorCode;
import com.github.care.wx.mp.error.ErrorCodeException;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-12 16:17
 **/
public class BaseController {


    /**
     * 获取登录用户
     *
     * @param request
     * @return
     */
    public LoginUser getLoginUser(HttpServletRequest request) {
        LoginUser loginUser =
            (LoginUser)request.getSession().getAttribute(ConfigConstants.LOGIN_SESSION.getComment());
        if(loginUser == null){
            throw new ErrorCodeException(ErrorCode.LOGIN_NO_ERR);
        }
        return loginUser;
    }
    /**
     * 登录
     *
     * @param request
     * @return
     */
    public void doLoginUser(HttpServletRequest request, User user) {
        LoginUser loginUser = new LoginUser();
        loginUser.setLoginType(LoginType.USER);
        loginUser.setName(user.getName());
        loginUser.setUserId(user.getId());
        request.getSession().setAttribute(ConfigConstants.LOGIN_SESSION.getComment(), loginUser);
    }


}
