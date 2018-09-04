package com.github.care.wx.mp.service.dto;

import com.github.care.wx.mp.dao.entity.FootMatch;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PlanDTO implements Serializable{

    private String name;

    private String info;

    private BigDecimal monery;

    private Date createTime;

    private List<FootMatch> matchDTOS;

    private Boolean isPay;

}
