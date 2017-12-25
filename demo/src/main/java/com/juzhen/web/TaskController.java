package com.juzhen.web;

import com.juzhen.dao.DBconnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    DBconnector dBconnector;

@RequestMapping("/")
    public String task() {
    dBconnector.config();
        return "hello task !! myage is ";
    }
}

