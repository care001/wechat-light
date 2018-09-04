package com.github.care.wx.mp.domain.base;

/**
 * @program: wechat-light
 * @description: ${description}
 * @author: Mr.Qian
 * @create: 2018-08-31 15:56
 **/

import com.github.care.wx.mp.error.ErrorCode;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private static final long serialVersionUID = -9075544910442561812L;
    private String code;
    private String msg;
    private T result;

    public Result() {
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg =  ErrorCode.SUCCESS.getMsg();
    }

    public Result(T result) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg =  ErrorCode.SUCCESS.getMsg();
        this.result = result;
    }

    public Result(String code, String resultMsg) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg =  ErrorCode.SUCCESS.getMsg();
        this.code = code;
        this.msg = resultMsg;
    }

    public Result(String code, String resultMsg, T result) {
        this.code = ErrorCode.SUCCESS.getCode();
        this.msg =  ErrorCode.SUCCESS.getMsg();
        this.code = code;
        this.msg = resultMsg;
        this.result = result;
    }

    public Result<T> setError(String code, String resultMsg) {
        this.code = code;
        this.msg = resultMsg;
        return this;
    }

    public T getResult() {
        return this.result;
    }

    public Result<T> setResult(T result) {
        this.result = result;
        return this;
    }

    public boolean isSuccess() {
        return StringUtils.equals(this.code, ErrorCode.SUCCESS.getCode());
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Result<T> setResultCode(String code) {
        this.code = code;
        return this;
    }

    public Result<T> setResultCode(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result<T> setResultMsg(String resultMsg) {
        this.msg = resultMsg;
        return this;
    }

    public static <T> Result create(String resultCode, String resultMsg, T data) {
        return new Result(resultCode, resultMsg, data);
    }

    public static Result create(String resultCode, String resultMsg) {
        return new Result(resultCode, resultMsg);
    }

    public static <T> Result create(T data) {
        return data != null && data instanceof ErrorCode ?
            new Result(((ErrorCode)data).getCode(), ((ErrorCode)data).getCode()) : new Result(data);
    }
}
