package com.fei.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("user".equals(beanName)){
			System.out.println("BeanPostProcessorTest.postProcessBeforeInitialization");
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("user".equals(beanName)){
			System.out.println("BeanPostProcessorTest.postProcessAfterInitialization");
		}
		return null;
	}
}
