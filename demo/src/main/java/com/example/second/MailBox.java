package com.example.second;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.List;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetException, MailjetSocketTimeoutException {
        for (MailInfo information : infos) {
            MailSender.sendMail(information);
        }
    }
}
