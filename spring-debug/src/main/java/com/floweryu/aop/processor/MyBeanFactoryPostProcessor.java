package com.floweryu.aop.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author Floweryu
 * @date 2023/3/5 21:08
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		MyBean bean = beanFactory.getBean(MyBean.class);
		System.out.println("MyBeanFactoryPostProcessor执行......");
	}
}
