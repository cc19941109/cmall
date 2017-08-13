package com.chen.cmall.common;

public enum  ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGMENT(11,"ILLEGAL_ARGMENT") ;

    private int code ;
    private  String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }


    public String getDesc() {
        return desc;
    }

}
