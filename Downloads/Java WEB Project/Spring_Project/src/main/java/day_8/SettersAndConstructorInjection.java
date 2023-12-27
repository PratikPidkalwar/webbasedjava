package day_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day_7.GreetingSerevice;

public class SettersAndConstructorInjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");		
		System.out.println("---------Setter Injection-------------");
		Object obj=ctx.getBean("myBean6");
		GreetingSerevice gs=(GreetingSerevice)obj;
		String greeting=gs.sayGreeting();
		System.out.println(greeting);
		
		System.out.println("---------Constructor Injection-------------");
		obj=ctx.getBean("myBean7");
		gs=(GreetingSerevice)obj;
		greeting=gs.sayGreeting();
		System.out.println(greeting);

		obj=ctx.getBean("myBean8");
		gs=(GreetingSerevice)obj;
		greeting=gs.sayGreeting();
		System.out.println(greeting);

		
	}

}
