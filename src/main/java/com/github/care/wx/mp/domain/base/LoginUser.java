package com.github.care.wx.mp.domain.base;

import com.github.care.wx.mp.constants.LoginType;
import lombok.Data;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-12 15:36
 **/
@Data
public class LoginUser {
    private Long userId;
    private LoginType loginType;
    private String name;
}
