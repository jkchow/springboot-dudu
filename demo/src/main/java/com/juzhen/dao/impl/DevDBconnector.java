package com.juzhen.dao.impl;

import com.juzhen.dao.DBconnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("deldb")
public class DevDBconnector implements DBconnector {
    @Override
    public void config() {
        System.out.println("deldb");
    }
}
