package com.github.care.wx.mp.controller;


import com.github.care.wx.mp.domain.base.Result;
import com.github.care.wx.mp.service.PlanService;
import com.github.care.wx.mp.service.dto.PlanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/online/plan")
public class PlanController{

    @Autowired
    private PlanService planService;

    private static final String OPEN_ID = "care001";

    @RequestMapping("/onePlan")
    public Result<PlanDTO> onePlan(@RequestParam(value="planId") Long planId){
        return Result.create(planService.findPlan(planId, OPEN_ID));
    }

    @GetMapping("/todayPlan")
    public Result<PlanDTO> todayPlan(){
        return Result.create(planService.findTodayPlan(OPEN_ID));
    }
}
