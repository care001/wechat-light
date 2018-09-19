package com.github.care.wx.mp.controller.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-11 11:02
 **/
@Data
public class CreateForumInfoParam implements Serializable{

    @NotNull
    private String info;
    @NotNull
    private String name;
}
