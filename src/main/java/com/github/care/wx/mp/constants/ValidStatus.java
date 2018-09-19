package com.github.care.wx.mp.constants;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-09-11 11:49
 **/
public enum ValidStatus {
    enabled("启用"), disabled("关闭"), deleted("删除");

    private String comment;

    ValidStatus(String comment) {
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
