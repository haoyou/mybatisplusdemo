package com.chy.mybatisplusdemo.response;

public class ComnReturnType {
    private String status;
    private Object result;

    public static ComnReturnType create(Object result){
        return create(result,"success");
    }
    public static ComnReturnType create(Object result,String status){
        ComnReturnType comnReturnType = new ComnReturnType();
        comnReturnType.setStatus(status);
        comnReturnType.setResult(result);
        return comnReturnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
