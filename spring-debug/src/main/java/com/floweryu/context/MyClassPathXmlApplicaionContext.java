package com.floweryu.context;

import com.floweryu.custom.MyBeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义扩展Context
 * @author Floweryu
 * @date 2023/3/26 19:37
 */
public class MyClassPathXmlApplicaionContext extends ClassPathXmlApplicationContext {
	
	public MyClassPathXmlApplicaionContext(String... configLocations) {
		super(configLocations);
	}
	
	
	@Override
	protected void initPropertySources() {
		System.out.println("自定义initProperSources");
		// 设置需要验证的属性值
		getEnvironment().setRequiredProperties("username");
		// 验证属性值是否合法, 不合法报错
		getEnvironment().validateRequiredProperties();
	}
	
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		beanFactory.setAllowBeanDefinitionOverriding(false);
		beanFactory.setAllowCircularReferences(false);
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("自定义postPrecessBeanFactory");
	}
}
