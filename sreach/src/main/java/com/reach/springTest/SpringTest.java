package com.reach.springTest;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/5/26 14:38
 */
public class SpringTest {
	public static void main(String[] args) {


//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config.xml"));
//		SimpleBean bean = (SimpleBean) bf.getBean("SimpleBean");
//		System.out.println(bean.getName());


		//使用beanfactory和 context都能获取 bean 有什么区别？
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		SimpleBean myBean2 = context.getBean(SimpleBean.class);
//		System.out.println(myBean2.getName());



	}
}
