package day_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day_7.GreetingSerevice;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configPath="spring-config.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext(configPath);
		
		Object obj = ctx.getBean("myBean");
		GreetingSerevice gs=(GreetingSerevice) obj;
		String reply=gs.sayGreeting();
		System.out.println(reply);
		
		obj = ctx.getBean("myBean2");
		gs=(GreetingSerevice) obj;
		reply=gs.sayGreeting();
		System.out.println(reply);
	}

}
