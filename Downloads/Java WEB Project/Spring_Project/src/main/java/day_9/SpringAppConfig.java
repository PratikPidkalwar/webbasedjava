package day_9;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"day_9","day_9_fourth"})
public class SpringAppConfig {

	@Bean
	public List<String> countries()
	{
		List<String> countryList=Arrays.asList("India","Nepal","Bhutan");
		return countryList;
	}
}
