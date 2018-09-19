package com.github.care.wx.mp.controller;

import com.github.care.wx.mp.controller.base.BaseController;
import com.github.care.wx.mp.controller.param.CreateForumInfoParam;
import com.github.care.wx.mp.controller.param.CreateForumMessageParam;
import com.github.care.wx.mp.controller.param.PageParam;
import com.github.care.wx.mp.dao.entity.ForumInfo;
import com.github.care.wx.mp.domain.base.LoginUser;
import com.github.care.wx.mp.domain.base.Result;
import com.github.care.wx.mp.security.Login;
import com.github.care.wx.mp.service.BbsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-11 11:00
 **/
@RestController
@RequestMapping(value="/online/bbs")
public class BbsController extends BaseController{
    @Autowired
    private BbsService bbsService;

    @PostMapping("/createForum")
    @Login
    public Result<ForumInfo> createForum(@RequestBody CreateForumInfoParam param, HttpServletRequest request){
        LoginUser loginUser = getLoginUser(request);
        return Result.create(bbsService.createForumInfo(loginUser.getUserId(), param));
    }

    @PostMapping("/deleteForum")
    @Login
    public Result<Boolean> deleteForum(@RequestParam(value = "forumId") Long forumId,
                                         HttpServletRequest request){
        LoginUser loginUser = getLoginUser(request);
        return Result.create(bbsService.deleteForumInfo(loginUser.getUserId(), forumId));
    }

    @PostMapping("/createMessage")
    @Login
    public Result<ForumInfo> createMessage(@RequestBody CreateForumMessageParam param,
                                           HttpServletRequest request){
        LoginUser loginUser = getLoginUser(request);
        return Result.create(bbsService.createMessage(loginUser.getUserId(), param));
    }

    @PostMapping("/deleteMessage")
    @Login
    public Result<Boolean> deleteMessage(@RequestParam(value = "messageId") Long messageId,
                                         HttpServletRequest request){
        LoginUser loginUser = getLoginUser(request);
        return Result.create(bbsService.deleteMessage(loginUser.getUserId(), messageId));
    }

    @PostMapping("/allForum")
    public Result<PageInfo<ForumInfo>> deleteMessage(@RequestBody PageParam pageParam){
        return Result.create(bbsService.deleteMessage(loginUser.getUserId(), messageId));
    }
}
