package com.yadong.ye.dubbo;

import com.yadong.ye.bean.DealOrderResult;
import com.yadong.ye.bean.Order;

public interface YYPayService {
    DealOrderResult dealOrder(Order order);
}
