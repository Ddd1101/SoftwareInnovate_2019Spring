package com.nju.coursework.saas.service;

import com.nju.coursework.saas.util.MailMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guhan on 17/11/8.
 */
@Service
public class MailService {
    @Autowired
    MailMaster mailMaster;

    public void validateMail(String userMail){
        mailMaster.sendForValidation(userMail,"https://localhost:8080/login");
    }

}