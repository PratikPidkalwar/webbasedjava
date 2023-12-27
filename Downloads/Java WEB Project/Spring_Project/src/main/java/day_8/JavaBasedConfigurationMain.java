package day_8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day_7.GreetingSerevice;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext annoCtx=new AnnotationConfigApplicationContext();
		
		Class<SpringConfig> configUnit=SpringConfig.class;
		
		annoCtx.register(configUnit);
		
		annoCtx.refresh();
		
		Object obj=annoCtx.getBean("helloBean");
		GreetingSerevice gs=(GreetingSerevice)obj;
		String reply=gs.sayGreeting();
		System.out.println(reply);
	
		System.out.println("------------------------");
		
		obj=annoCtx.getBean("welcomeBean");
		gs=(GreetingSerevice)obj;
		reply=gs.sayGreeting();
		System.out.println(reply);
	
		System.out.println("------------------------");
		
		obj=annoCtx.getBean("userBean");
		gs=(GreetingSerevice)obj;
		reply=gs.sayGreeting();
		System.out.println(reply);
	
		System.out.println("------------------------");
		
		obj=annoCtx.getBean("userGreetingBean");
		gs=(GreetingSerevice)obj;
		reply=gs.sayGreeting();
		System.out.println(reply);
	
		
		Object o1=annoCtx.getBean("userGreetingBean");
		Object o2=annoCtx.getBean("userGreetingBean");
		System.out.println(o1==o2);
	}

}
