package com.yusufcs.restTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.yusufcs.restTest"})
public class SpringBootBasicApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApiApplication.class, args);
	}

}
