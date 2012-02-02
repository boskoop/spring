package ch.xog.boskoop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.printHello();
	}

}
