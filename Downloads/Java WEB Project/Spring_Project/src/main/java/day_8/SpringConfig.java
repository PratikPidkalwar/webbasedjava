package day_8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import day_7.GreetingSerevice;
import day_7.HelloService;
import day_7.WelcomeService;

@Configuration
@ComponentScan
public class SpringConfig {

	@Bean
	public GreetingSerevice helloBean()
	{
		GreetingSerevice service=new HelloService();
		return service;
	}
	
	@Bean
	public GreetingSerevice welcomeBean()
	{
		GreetingSerevice service =new WelcomeService();
		return service;
	}
	
	@Bean
	public GreetingSerevice userBean()
	{
		GreetingSerevice service=new UserService();
		return service;
	}
	
	@Bean
	@Scope("prototype")
	@Lazy
	public GreetingSerevice userGreetingBean()
	{
		GreetingSerevice service=new UserGreetingService("Hi", 59, "Tom Cruise");
		return service;
	}
}
