package com.lqh.common;

public class ResponseBodyCode {
    private Integer status;
    private Object data;
    private String msg;

    private ResponseBodyCode(Integer status,Object data){}
    private ResponseBodyCode(Integer status,String msg){}
    private ResponseBodyCode(Object data){
        this.data=data;
        this.status=200;
    }
    private ResponseBodyCode(String msg){}

    public static ResponseBodyCode successData(Object data){
        return new ResponseBodyCode(data);
    }
}
