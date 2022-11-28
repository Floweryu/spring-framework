package com.floweryu.aop;

import com.floweryu.aop.config.AopConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Floweryu
 * @date 2022/11/28 10:51
 */
public class AopTest {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
	
	@Test
	public void aopTest() {
		MathCalculator bean = context.getBean(MathCalculator.class);
		bean.div(8, 2);
		context.close();
	}
}
