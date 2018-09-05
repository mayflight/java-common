package com.yadong.ye.dubbo;

import com.yadong.ye.bean.DealOrderResult;
import com.yadong.ye.bean.Order;

public interface YyPayService {
    /**
     * ∂©µ•¥¶¿Ì
     * */
    DealOrderResult dealOrder(Order order);
}
