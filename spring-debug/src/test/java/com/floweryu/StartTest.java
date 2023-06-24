package com.floweryu;

import com.floweryu.config.EditorConfig;
import com.floweryu.context.MyClassPathXmlApplicaionContext;
import com.floweryu.editor.Address;
import com.floweryu.editor.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Floweryu
 * @date 2023/3/26 13:57
 */
public class StartTest {
	
	@Test
	public void startTest() {
		MyClassPathXmlApplicaionContext ac = new MyClassPathXmlApplicaionContext("application.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
	}

	@Test
	public void properTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EditorConfig.class);
		Customer bean = context.getBean(Customer.class);
		Address address = bean.getAddress();
		System.out.println(address);
	}
}
