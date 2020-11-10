package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  Dongsu
 * @date  2020/11/9 21:55
 * @desc  用户controller
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @author  Dongsu
     * @date  2020/11/10 22:08
     * @desc  获取单个用户
     **/
    @GetMapping("/singleUser")
    public User singleUser(String userId) {
        return userService.singleUser(userId);
    }


}
