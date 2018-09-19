package com.github.care.wx.mp.error;

public enum  ErrorCode
{

    SUCCESS("200", "请求成功"),
    FAIL("500", "系统错误"),

    //1开头程序性错误
    DB_ERR("100001","数据库操作异常"),
    REFLEX_ERR("100002","反射处理异常"),

    //2业务错误
    LOGIN_NO_ERR("200001","您还没有登录"),
    LOGIN_POWER_ERR("200002","用户角色错误，无法查看信息"),

    FORUM_INFO_NOT_EXIST("210001","帖子不存在"),

    FORUM_MESSAGE_NOT_EXIST("210002","回复不存在"),
    ;


    private String code;
    private String msg;

    ErrorCode(String code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
