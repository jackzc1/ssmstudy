package com.soft.controller;

import com.soft.entity.User;
import com.soft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2020/2/13.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String userList() {
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        return "user";
    }
}
