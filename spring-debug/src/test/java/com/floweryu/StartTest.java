package com.floweryu;

import com.floweryu.context.MyClassPathXmlApplicaionContext;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Floweryu
 * @date 2023/3/26 13:57
 */
public class StartTest {
	
	@Test
	public void startTest() {
		MyClassPathXmlApplicaionContext ac = new MyClassPathXmlApplicaionContext("spring-${username}.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");
	}
}
