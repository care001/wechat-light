package com.github.care.wx.mp.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.open_id
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phone
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.pwd
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private String pwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private BigDecimal status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.create_time
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.update_time
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.wx_img
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private String wxImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.open_id
     *
     * @return the value of user.open_id
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.open_id
     *
     * @param openId the value for user.open_id
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phone
     *
     * @return the value of user.phone
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phone
     *
     * @param phone the value for user.phone
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.pwd
     *
     * @return the value of user.pwd
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.pwd
     *
     * @param pwd the value for user.pwd
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public BigDecimal getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.create_time
     *
     * @return the value of user.create_time
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.create_time
     *
     * @param createTime the value for user.create_time
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.update_time
     *
     * @return the value of user.update_time
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.update_time
     *
     * @param updateTime the value for user.update_time
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.wx_img
     *
     * @return the value of user.wx_img
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public String getWxImg() {
        return wxImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.wx_img
     *
     * @param wxImg the value for user.wx_img
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    public void setWxImg(String wxImg) {
        this.wxImg = wxImg == null ? null : wxImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Sep 04 09:45:44 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openId=").append(openId);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", pwd=").append(pwd);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", wxImg=").append(wxImg);
        sb.append("]");
        return sb.toString();
    }
}