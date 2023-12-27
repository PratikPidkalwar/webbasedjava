package day_9;

import org.springframework.stereotype.Component;

@Component("third")
public class ThirdTest {

	public ThirdTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Third Test Initialised..");
	}
	
	public void doTest()
	{
		System.out.println("Third test Works..");
	}

}
