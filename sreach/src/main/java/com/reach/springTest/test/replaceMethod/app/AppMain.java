package com.reach.springTest.test.replaceMethod.app;

import com.reach.springTest.test.replaceMethod.TestChangeMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/12/18 16:52
 */
public class AppMain {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("methodReplace.xml");
		TestChangeMethod testChangeMethod = (TestChangeMethod) context.getBean("testChangeMethod");
		testChangeMethod.changeMe();

	}
}
