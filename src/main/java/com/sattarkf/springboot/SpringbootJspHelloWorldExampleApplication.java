package com.sattarkf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
//@ComponentScan(basePackages={"com.satarkf.springboot"})
public class SpringbootJspHelloWorldExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJspHelloWorldExampleApplication.class, args);
	}

}
