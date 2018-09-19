package com.github.care.wx.mp.controller.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-12 17:44
 **/
@Data
public class PageParam implements Serializable{
    private Integer pageNo;
    private Integer pageSize;
}
