package com.yadong.ye.dubbo;

import com.yadong.ye.bean.BaseResult;
import com.yadong.ye.bean.MailDetailData;

/**
 * @author Ton
 */
public interface MailSendService {
    public BaseResult sendSimpleMail(MailDetailData data);

}
