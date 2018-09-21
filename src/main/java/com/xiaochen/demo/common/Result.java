package com.xiaochen.demo.common;

import java.io.Serializable;
public class Result implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 9012806816596216834L;

    private String code;
    
    private String message;
    
    private Object data = "{}"; // 默认为空 json
    
    public Result() {
        
    }
    
    public Result(StatusCode statusCode) {
        super();
        this.code = statusCode.getValue();
        this.message = statusCode.getMsg();
    }
    
    public Result(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }
    
    public Result(String code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }
    
    public static Result success(Object data) {
        return new Result(StatusCode.SUCCESS.getValue(), StatusCode.SUCCESS.getMsg(), data);
        
    }
    
    public static Result successMsg(String message) {
        return new Result(StatusCode.SUCCESS.getValue(), message);
    }
    
    public static Result success() {
        return new Result(StatusCode.SUCCESS.getValue(), StatusCode.SUCCESS.getMsg()) ;
        
    }
    
    public static Result error(Object data) {
        return new Result(StatusCode.ERROR.getValue(), StatusCode.ERROR.getMsg(), data);
    }
    
    public static Result error(String message) {
        return new Result(StatusCode.ERROR.getValue(), message);
    }

    public static Result fail(Object data) {
        return new Result(StatusCode.FAIL.getValue(), StatusCode.FAIL.getMsg(), data);
    }

    public static Result fail(String message) {
        return new Result(StatusCode.FAIL.getValue(), message);
    }

    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
}
