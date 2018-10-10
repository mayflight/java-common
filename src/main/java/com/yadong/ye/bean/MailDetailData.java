package com.yadong.ye.bean;

import java.io.Serializable;

/**
 * @author yyd
 * @date 2018/10/10
 */
public class MailDetailData implements Serializable{
    private static final long serialVersionUID = -4975125350517251926L;
    private String receiveMailAccount;
    private String subject;
    private String content;

    public String getReceiveMailAccount() {
        return receiveMailAccount;
    }

    public void setReceiveMailAccount(String receiveMailAccount) {
        this.receiveMailAccount = receiveMailAccount;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
