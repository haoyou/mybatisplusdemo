package com.chy.mybatisplusdemo.errors;

public enum EnumList implements CommonErr{
    /**
     * 通用错误异常 1
     * 用户登录相关异常 2
     * */
    PARAMETER_INVALID(10001,"parameter"),
    UNKNOW_ERROR(10002,"unknow error msg"),
    USERNAMEANDPWD_ERROR(20001,"用户名或密码错误"),
    USERLOGIN_ERROR(20002,"用户登录过程出现错误")
    ;

    private int errcode;
    private String msg;

    EnumList(int errcode, String errmsg) {
        this.errcode = errcode;
        this.msg = errmsg;
    }



    @Override
    public int getErrCode() {
        return 0;
    }

    @Override
    public String getErrMsg() {
        return null;
    }

    @Override
    public CommonErr setErrMsg(String msg) {
        return null;
    }
}
