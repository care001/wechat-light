package com.github.care.wx.mp.error;

public enum  ErrorCode
{

    SUCCESS("200", "请求成功"),
    FAIL("500", "系统错误"),

    //1开头程序性错误
    DB_ERR("100001","数据库操作异常"),
    REFLEX_ERR("100002","反射处理异常"),

    //2业务错误
    LOGIN_ERR("200001","您还没有登录"),



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
