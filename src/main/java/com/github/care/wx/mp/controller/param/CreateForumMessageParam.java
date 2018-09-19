package com.github.care.wx.mp.controller.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-12 16:57
 **/
@Data
public class CreateForumMessageParam implements Serializable{
    @NotNull
    private Long forumInfoId;
    @NotNull
    private String info;
}
