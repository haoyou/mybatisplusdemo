package com.chy.mybatisplusdemo.errors;

public enum EnumList implements CommonErr{
    /**
     * 通用错误异常
     * */
    PARAMETER_INVALID(10001,"parameter"),
    UNKNOW_ERROR(10002,"unknow error msg");

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
