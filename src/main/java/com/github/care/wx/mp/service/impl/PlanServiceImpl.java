package com.github.care.wx.mp.service.impl;

import com.github.care.wx.mp.dao.entity.*;
import com.github.care.wx.mp.dao.mapper.FootMatchMapper;
import com.github.care.wx.mp.dao.mapper.FootPlanMapper;
import com.github.care.wx.mp.dao.mapper.PayInfoMapper;
import com.github.care.wx.mp.service.PlanService;
import com.github.care.wx.mp.service.dto.PlanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: online
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-08-22 09:40
 **/
@Service
public class PlanServiceImpl implements PlanService{

    @Autowired
    private PayInfoMapper payInfoMapper;
    @Autowired
    private FootPlanMapper planMapper;
    @Autowired
    private FootMatchMapper matchMapper;

    @Override
    public PlanDTO findPlan(Long planId, String openId) {
        FootPlan plan = planMapper.selectByPrimaryKey(planId);
        if(plan == null){
            throw new RuntimeException("方案不存在");
        }
        return planToDTO(plan, openId);
    }

    @Override
    public List<PlanDTO> findTodayPlan(String openId) {
        List<PlanDTO> dtos = new ArrayList<>();
        Date today = new Date();
        FootPlanCriteria criteria = new FootPlanCriteria();
        criteria.createCriteria().andShowEndTimeGreaterThan(today).andShowStartTimeLessThan(today);
        List<FootPlan> plans = planMapper.selectByExample(criteria);
        for (FootPlan plan : plans){
            dtos.add(planToDTO(plan, openId));
        }
        return dtos;
    }


    public PlanDTO planToDTO(FootPlan plan, String openId) {
        PlanDTO dto = new PlanDTO();
        dto.setIsPay(Boolean.FALSE);
        dto.setCreateTime(plan.getCreateTime());
        dto.setInfo(plan.getInfo());
        dto.setMonery(plan.getMonery());
        dto.setName(plan.getName());
        //是否支付
        PayInfoCriteria criteria = new PayInfoCriteria();
        criteria.createCriteria().andOpenIdEqualTo(openId).andPlanIdEqualTo(plan.getId());
        if(payInfoMapper.countByExample(criteria)<1){
            return dto;
        }
        dto.setIsPay(Boolean.TRUE);
        //查询比赛
        FootMatchCriteria matchCriteria = new FootMatchCriteria();
        matchCriteria.createCriteria().andPlanIdEqualTo(plan.getId());
        List<FootMatch> matches = matchMapper.selectByExample(matchCriteria);
        dto.setMatchDTOS(matches);
        return dto;
    }
}
