package com.floweryu.aop.config;

import com.floweryu.aop.LogAspects;
import com.floweryu.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Floweryu
 * @date 2022/11/28 10:50
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
	@Bean
	public MathCalculator mathCalculator() {
		return new MathCalculator();
	}
	
	
	@Bean
	public LogAspects logAspects() {
		return new LogAspects();
	}
}
