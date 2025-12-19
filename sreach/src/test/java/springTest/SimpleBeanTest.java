package springTest;

import com.reach.springTest.SimpleBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * TODO
 *
 * @auther pan_yhao
 * @date 2025/5/28 13:41
 */
public class SimpleBeanTest {

	@Test
	public void SimpleBeanTestOne(){

		//XmlBeanFactory 和  ApplicationContext 的区别: XmlBeanFactory已经过时
		// context 是整个 spring的上下文环境 所有的 @Component、@Service、@Controller 等都注册在这里。
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		SimpleBean myBean2 = context.getBean(SimpleBean.class);
//		System.out.println(myBean2.getName());

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("config.xml"));
		SimpleBean myBean = factory.getBean(SimpleBean.class);
		System.out.println(myBean.getName());
		System.out.println(myBean.getColors());


	}




}
