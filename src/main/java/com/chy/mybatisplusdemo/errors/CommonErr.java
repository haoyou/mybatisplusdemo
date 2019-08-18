package com.chy.mybatisplusdemo.errors;

public interface CommonErr {
    int getErrCode();
    String getErrMsg();
    CommonErr setErrMsg(String msg);
}
