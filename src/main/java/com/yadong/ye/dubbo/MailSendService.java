package com.yadong.ye.dubbo;

import com.yadong.ye.bean.MailDetailData;

/**
 * @author Ton
 */
public interface MailSendService {
    public String sendSimpleMail(MailDetailData data);

}
