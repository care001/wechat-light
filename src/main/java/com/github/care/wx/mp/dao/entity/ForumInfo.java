package com.github.care.wx.mp.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class ForumInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.id
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.user_id
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.name
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.hot
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private Long hot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.status
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.create_time
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.update_time
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column forum_info.info
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private String info;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table forum_info
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.id
     *
     * @return the value of forum_info.id
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.id
     *
     * @param id the value for forum_info.id
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.user_id
     *
     * @return the value of forum_info.user_id
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.user_id
     *
     * @param userId the value for forum_info.user_id
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.name
     *
     * @return the value of forum_info.name
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.name
     *
     * @param name the value for forum_info.name
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.hot
     *
     * @return the value of forum_info.hot
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public Long getHot() {
        return hot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.hot
     *
     * @param hot the value for forum_info.hot
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setHot(Long hot) {
        this.hot = hot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.status
     *
     * @return the value of forum_info.status
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.status
     *
     * @param status the value for forum_info.status
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.create_time
     *
     * @return the value of forum_info.create_time
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.create_time
     *
     * @param createTime the value for forum_info.create_time
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.update_time
     *
     * @return the value of forum_info.update_time
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.update_time
     *
     * @param updateTime the value for forum_info.update_time
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column forum_info.info
     *
     * @return the value of forum_info.info
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column forum_info.info
     *
     * @param info the value for forum_info.info
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum_info
     *
     * @mbggenerated Tue Sep 04 11:16:43 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", hot=").append(hot);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", info=").append(info);
        sb.append("]");
        return sb.toString();
    }
}