package com.fei.config;


import com.fei.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.fei")
public class JavaConfig {

	@Bean
	public User user() {
		return new User("YunFei", 18);
	}


}
