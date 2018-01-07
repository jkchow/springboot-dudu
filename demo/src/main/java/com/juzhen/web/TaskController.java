package com.juzhen.web;

import com.juzhen.dao.DBconnector;
import com.juzhen.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    DBconnector dBconnector;
    @Autowired
    private User user;

    @RequestMapping("/")
    @ResponseBody
    public String task() {
        dBconnector.config();
        return "hello task !! myage is 12岁 "+user.getName();
    }
}

