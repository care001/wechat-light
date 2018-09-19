package com.github.care.wx.mp.security;


import com.github.care.wx.mp.constants.LoginType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: wechat-light
 * @description: 用户访问控制注解,默认是登录权限,也就是必须用户登录才能访问
 * @author: Mr.Qian
 * @create: 2018-09-11 11:57
 **/
@Target( { ElementType.METHOD, ElementType.TYPE, ElementType.PACKAGE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Login {

    LoginType[] value() default {LoginType.USER};

}
