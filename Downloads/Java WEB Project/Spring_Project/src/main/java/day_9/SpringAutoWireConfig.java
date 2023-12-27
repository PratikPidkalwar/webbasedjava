package day_9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringAutoWireConfig {

	
	@Bean
	public MusicSystem getMusicSystem()
	{
		MusicSystem musicSystem=new MusicSystem("Sony", "Dolby");
		return musicSystem;
	}
	
	@Bean
	@Primary
	public MusicSystem getMusicSystem2()
	{
		MusicSystem musicSystem=new MusicSystem("Tata Sky", "HiTech");
		return musicSystem;
	}
	
	@Bean
	public Engine getEngine()
	{
		Engine engine=new Engine("Petrol", "1200CC");
		return engine;
	}
	
	@Bean("myCar")
	public Car getCar()
	{
		Car car=new Car();
		car.setMake("Hyundai");
		car.setModel("I-20");
		car.setPrice(765000);
		return car;
	}
}
