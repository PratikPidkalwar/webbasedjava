package ToDo_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SetterAndConstructorInjectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");		
		System.out.println("---------Setter Injection-------------");
		Object obj=ctx.getBean("setCourse");
		GreetingService gs=(GreetingService)obj;
		String greeting=gs.sayGreeting();
		System.out.println(greeting);
		
		
		System.out.println("---------Constructor Injection-------------");
		obj=ctx.getBean("constructCourse");
		gs=(GreetingService)obj;
		greeting=gs.sayGreeting();
		System.out.println(greeting);

	}

}
