package com.yadong.ye.bean;

import java.io.Serializable;


public class DealOrderResult implements Serializable {
    private static final long serialVersionUID = -6953562206735149435L;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
