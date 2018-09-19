package com.github.care.wx.mp.constants;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-12 15:34
 **/
public enum ConfigConstants {
    LOGIN_SESSION("用户登录信息"),;

    private String comment;

    ConfigConstants(String comment) {
        this.comment = comment;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
