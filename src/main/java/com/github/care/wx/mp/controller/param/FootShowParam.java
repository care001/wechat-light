package com.github.care.wx.mp.controller.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class FootShowParam implements Serializable{
    private String startTime;
    private String endTime;
    private String  userId;
    private String  siteId;
    private String  hot;
    private Long loginUserId;
}
