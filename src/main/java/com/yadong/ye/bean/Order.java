package com.yadong.ye.bean;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = -7337003535559206902L;
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
