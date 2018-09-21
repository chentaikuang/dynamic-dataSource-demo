package com.xiaochen.demo.common;

public enum StatusCode {

    SUCCESS("0", "成功"),
    FAIL("1", "失败"),
    ERROR("500","服务器内部错误"),
    PARAMTER("400","请求参数错误,调试阶段"),

    ;
    private String value;
    private String msg;

    private StatusCode(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    /**
     * 获取 value
     *
     * @return 返回 value
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取 msg
     *
     * @return 返回 msg
     */
    public String getMsg() {
        return msg;
    }

}
