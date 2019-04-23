package com.nju.coursework.saas.controller;

import com.nju.coursework.saas.entity.response.GeneralResponse;
import com.nju.coursework.saas.service.MailService;
import com.nju.coursework.saas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guhan on 17/11/8.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    @ResponseBody
    public GeneralResponse register(String email, String password){
        return userService.register(email,password);
    }

    @GetMapping("/login")
    @ResponseBody
    public GeneralResponse login(String email, String password){
        return userService.login(email, password);
    }
}