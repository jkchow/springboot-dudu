package com.juzhen;

import com.juzhen.domain.User;
import com.juzhen.domain.UserTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({User.class,UserTest.class})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Value("${com.juzhen.name}")
	private String name;
	@Value(value = "${com.juzhen.want}")
	private String want;


}
