package com.github.care.wx.mp.service.impl;

import com.github.care.wx.mp.constants.ValidStatus;
import com.github.care.wx.mp.controller.param.CreateForumInfoParam;
import com.github.care.wx.mp.controller.param.CreateForumMessageParam;
import com.github.care.wx.mp.controller.param.PageParam;
import com.github.care.wx.mp.dao.entity.ForumInfo;
import com.github.care.wx.mp.dao.entity.ForumInfoCriteria;
import com.github.care.wx.mp.dao.entity.ForumMessage;
import com.github.care.wx.mp.dao.entity.ForumMessageCriteria;
import com.github.care.wx.mp.dao.mapper.ForumInfoMapper;
import com.github.care.wx.mp.dao.mapper.ForumMessageMapper;
import com.github.care.wx.mp.error.ErrorCode;
import com.github.care.wx.mp.error.ErrorCodeException;
import com.github.care.wx.mp.service.BbsService;
import com.github.care.wx.mp.utils.TimeUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-11 11:07
 **/
@Service
public class BbsServiceImpl implements BbsService{
    @Autowired
    private ForumInfoMapper forumInfoMapper;

    @Autowired
    private ForumMessageMapper forumMessageMapper;

    private static final Long ZERO = 0L;

    @Override
    public ForumInfo createForumInfo(Long userId, CreateForumInfoParam param) {
        ForumInfo forumInfo = new ForumInfo();
        forumInfo.setCreateTime(TimeUtils.currentTime());
        forumInfo.setUpdateTime(TimeUtils.currentTime());
        forumInfo.setHot(ZERO);
        forumInfo.setStatus(ValidStatus.enabled.getComment());
        forumInfo.setInfo(param.getInfo());
        forumInfo.setName(param.getName());
        forumInfo.setUserId(userId);
        forumInfoMapper.insert(forumInfo);
        return forumInfo;
    }

    @Override
    public Boolean deleteForumInfo(Long userId, Long forumId) {
        ForumInfoCriteria criteria = new ForumInfoCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId).andIdEqualTo(forumId);
        List<ForumInfo> forumInfos = forumInfoMapper.selectByExample(criteria);
        if(CollectionUtils.isEmpty(forumInfos)){
            throw new ErrorCodeException(ErrorCode.FORUM_INFO_NOT_EXIST);
        }
        ForumInfo forumInfo = forumInfos.get(0);
        forumInfo.setStatus(ValidStatus.deleted.getComment());
        return forumInfoMapper.updateByPrimaryKey(forumInfo) > 0;
    }

    @Override
    public ForumMessage createMessage(Long userId, CreateForumMessageParam param) {
        ForumMessage forumMessage = new ForumMessage();
        forumMessage.setCreateTime(TimeUtils.currentTime());
        forumMessage.setUpdateTime(TimeUtils.currentTime());
        forumMessage.setForumInfoId(param.getForumInfoId());
        forumMessage.setHot(ZERO);
        forumMessage.setInfo(param.getInfo());
        forumMessage.setStatus(ValidStatus.enabled.getComment());
        forumMessage.setUserId(userId);
        forumMessageMapper.insert(forumMessage);
        return forumMessage;
    }

    @Override
    public Boolean deleteMessage(Long userId, Long messageId) {
        ForumMessageCriteria criteria = new ForumMessageCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId).andIdEqualTo(messageId);
        List<ForumMessage> messages = forumMessageMapper.selectByExample(criteria);
        if(CollectionUtils.isEmpty(messages)){
            throw new ErrorCodeException(ErrorCode.FORUM_MESSAGE_NOT_EXIST);
        }
        ForumMessage message = messages.get(0);
        message.setStatus(ValidStatus.deleted.getComment());
        return forumMessageMapper.updateByPrimaryKey(message) > 0;
    }

    @Override
    public PageInfo<ForumInfo> findPageInfo(PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNo(), pageParam.getPageSize());
        ForumInfoCriteria criteria = new ForumInfoCriteria();
        criteria.createCriteria().andStatusEqualTo(ValidStatus.enabled.getComment());
        criteria.setOrderByClause("create_time desc");
        List<ForumInfo> forumInfos = forumInfoMapper.selectByExample(criteria);
        return new PageInfo<>(forumInfos);
    }

    @Override
    public PageInfo<ForumMessage> findPageMessage(PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNo(), pageParam.getPageSize());
        ForumMessageCriteria criteria = new ForumMessageCriteria();
        criteria.createCriteria().andStatusEqualTo(ValidStatus.enabled.getComment());
        criteria.setOrderByClause("create_time desc");
        List<ForumMessage> messages = forumMessageMapper.selectByExample(criteria);
        return new PageInfo<>(messages);
    }
}
