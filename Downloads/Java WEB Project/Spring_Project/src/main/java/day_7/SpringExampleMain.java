package day_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String configPath = "./src/main/resources/spring-config.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(configPath);
		
		//Obtaining the object (bean) against its ID
		Object obj = ctx.getBean("myBean");
		GreetingSerevice gs = (GreetingSerevice)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);

		
		obj = ctx.getBean("myBean2");
		gs = (GreetingSerevice)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);

	}

}
