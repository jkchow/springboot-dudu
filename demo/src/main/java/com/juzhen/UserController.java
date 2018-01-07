package com.juzhen;

import com.juzhen.domain.User;
import com.juzhen.domain.UserTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    //    @Autowired
    @Resource
    private User user;

    @Resource
    private UserTest userTest;

    @RequestMapping("/")
    public String hi() {
        return user.getName() + ",!" + user.getWant();
    }

    @RequestMapping("/hii")
    public String hii() {
        return userTest.getName() + " ," + userTest.getWant();
    }
}
