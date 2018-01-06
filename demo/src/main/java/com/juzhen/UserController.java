package com.juzhen;

import com.juzhen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
//    @Autowired
    @Resource
    private User user;
    @Autowired
    private User userTest;
    @RequestMapping("/")
    public String hi() {
        return user.getName()+",!"+user.getWant();
    }
    @RequestMapping("/hi")
    public String hii() {
        return userTest.getName()+","+userTest.getWant();
    }
}
