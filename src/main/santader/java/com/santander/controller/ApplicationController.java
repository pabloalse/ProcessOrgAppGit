package com.santander.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.santander.model.UserGroup;

@RestController
public class ApplicationController {

    @RequestMapping("/user")
    public boolean user (@RequestParam(value="userID") UserGroup userGroup) {
        return true;
    }

    @RequestMapping("/group")
    public boolean group (@RequestParam(value="groupID") UserGroup userGroup) {
        return true;
    }

    @RequestMapping("/userGroup")
    public boolean userGroup (@RequestParam(value="groupID") UserGroup userGroup) {
        return true;
    }

}
