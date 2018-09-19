package com.github.care.wx.mp.service;

import com.github.care.wx.mp.controller.param.CreateForumInfoParam;
import com.github.care.wx.mp.controller.param.CreateForumMessageParam;
import com.github.care.wx.mp.controller.param.PageParam;
import com.github.care.wx.mp.dao.entity.ForumInfo;
import com.github.care.wx.mp.dao.entity.ForumMessage;
import com.github.pagehelper.PageInfo;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-11 11:06
 **/
public interface BbsService {

    ForumInfo createForumInfo(Long userId, CreateForumInfoParam param);

    Boolean deleteForumInfo(Long userId, Long forumId);


    ForumMessage createMessage(Long userId, CreateForumMessageParam param);

    Boolean deleteMessage(Long userId, Long messageId);


    PageInfo<ForumInfo> findPageInfo(PageParam pageParam);

    PageInfo<ForumMessage> findPageMessage(PageParam pageParam);
}
