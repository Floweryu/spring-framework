package com.floweryu.aop;

import com.floweryu.aop.config.AopConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Floweryu
 * @date 2022/11/28 10:51
 */
public class AopTest {
	
	
	@Test
	public void aopTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		// 到这一步就生成了代理对象, 所以就可以进行方法的调用
		// 但是此时有6个Advisor, 他们在执行的时候是按照某个顺序来执行的, 而且由一个通知会跳转到另一个通知
		// 所以, 还需要构建一个拦截器链(责任链模式), 只有创建好链式结构, 才能顺利向下执行
		MathCalculator bean = context.getBean(MathCalculator.class);
		bean.div(8, 2);
		context.close();
	}
	
	@Test
	public void xmlTest() {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
		MathCalculator bean = ac.getBean(MathCalculator.class);
		bean.div(8, 2);
	}
}
