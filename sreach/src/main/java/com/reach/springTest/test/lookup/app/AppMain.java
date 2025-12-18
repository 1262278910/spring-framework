package com.reach.springTest.test.lookup.app;

import com.reach.springTest.test.lookup.GetBeanTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/12/18 15:54
 */
public class AppMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("lookUp.xml");
		GetBeanTest getBeanTest = (GetBeanTest) context.getBean("getBeanTest");
		getBeanTest.showMe();

	}
}
