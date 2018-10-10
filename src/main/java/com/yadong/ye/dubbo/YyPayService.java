package com.yadong.ye.dubbo;

import com.yadong.ye.bean.DealOrderResult;
import com.yadong.ye.bean.Order;

public interface YyPayService {
    /**
     * 订单处理
     * */
    DealOrderResult dealOrder(Order order);
}
