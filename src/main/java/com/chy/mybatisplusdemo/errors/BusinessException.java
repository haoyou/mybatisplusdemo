package com.chy.mybatisplusdemo.errors;

public class BusinessException extends Exception implements CommonErr{

    private CommonErr commonErr;

    public BusinessException(CommonErr commonErr){
        this.commonErr = commonErr;
    }
    public BusinessException(CommonErr commonErr,String msg){
        this.commonErr = commonErr;
        this.commonErr.setErrMsg(msg);
    }
    @Override
    public int getErrCode() {
        return this.commonErr.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonErr.getErrMsg();
    }

    @Override
    public CommonErr setErrMsg(String msg) {
        this.commonErr.setErrMsg(msg);
        return this;
    }
}
