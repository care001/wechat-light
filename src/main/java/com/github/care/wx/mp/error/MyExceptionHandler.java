package com.github.care.wx.mp.error;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-08-31 16:06
 **/

import com.github.care.wx.mp.domain.base.Result;
import com.github.care.wx.mp.utils.MyStringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = "com.github.care.wx.mp.controller")
@Slf4j(topic = "err")
public class MyExceptionHandler {


    private final static String METHOD_ERR = "method err";

    private final static String MY_ERR = "520";

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handler(HttpServletRequest req, Exception e) throws Exception {
        Result result = Result.create(ErrorCode.FAIL);
        String msg = e.getMessage();
        log.error(msg, e);
        if (e instanceof ErrorCodeException) {
            return Result.create(e);
        }else if (e instanceof MethodArgumentNotValidException){
            MethodArgumentNotValidException we = (MethodArgumentNotValidException) e;
            msg = we.getBindingResult().getAllErrors().get(0).getDefaultMessage();
            return Result.create(METHOD_ERR, msg);
        }else if (e instanceof BindException){
            BindException we = (BindException) e;
            msg = we.getFieldErrors().get(0).getDefaultMessage();
            return Result.create(METHOD_ERR, msg);
        }

        /**
         * 如果有中文，错误信息为中文
         *  如果没有中文，按照异常类型进行翻译。
         */
        else if (null != msg && MyStringUtils.isContainsChinese(msg)) {
            return Result.create(MY_ERR, msg);
        }
        return result;
    }


}

