package com.github.care.wx.mp.service;

import com.github.care.wx.mp.service.dto.PlanDTO;

import java.util.List;

/**
 * @program: online
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-08-22 09:40
 **/
public interface PlanService {

    PlanDTO findPlan(Long planId, String openId);

    List<PlanDTO> findTodayPlan(String openId);

}
