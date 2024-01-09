package com.fei.beanPostProcessor;

import com.fei.beans.User;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class InitializingTest implements InitializingBean {

	public InitializingTest() {
		System.out.println("InitializingTest构造方法执行...");
	}


	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct方法执行...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingTest.afterPropertiesSet");
	}
}
