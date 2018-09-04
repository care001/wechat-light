package com.github.care.wx.mp.error;

public class ErrorCodeException extends RuntimeException {

    private String errcode;

    public ErrorCodeException(ErrorCode errcode) {
        super(errcode.getMsg());
        this.errcode = errcode.getCode();
    }

    public ErrorCodeException(ErrorCode errcode, String errMessage) {
        super(errMessage);
        this.errcode = errcode.getCode();
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }
}
