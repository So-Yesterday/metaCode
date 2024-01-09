package com.fei.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class InstantiationTest implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if ("user".equals(beanName)){
			System.out.println("实例化InstantiationTest.postProcessBeforeInstantiation");
		}

		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if ("user".equals(beanName)){
			System.out.println("实例化InstantiationTest.postProcessAfterInstantiation");
		}
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if ("user".equals(beanName)) {
			System.out.println("属性值pvs.getPropertyValues()");
		}
		return null;
	}
}
