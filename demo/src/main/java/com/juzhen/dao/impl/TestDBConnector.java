package com.juzhen.dao.impl;

import com.juzhen.dao.DBconnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("testdb")
public class TestDBConnector implements DBconnector {
    @Override
    public void config() {
        System.out.println("testdb");
    }
}
