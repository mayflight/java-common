package com.yadong.ye.bean;

import java.io.Serializable;

/**
 * @author yyd
 * @date 2018/10/10
 */
public class BaseResult implements Serializable{
    private static final long serialVersionUID = 2882479405466147496L;
    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
