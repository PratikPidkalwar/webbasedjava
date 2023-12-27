package day_9;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day_9_fourth.FourthTest;
import day_9_fourth.another.AnotherFourthTest;

public class PureAnnotationBasedConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringAppConfig> configClass=SpringAppConfig.class;
		
		AnnotationConfigApplicationContext annoCtx=new AnnotationConfigApplicationContext(configClass);
		
		FirstTest firstTest=annoCtx.getBean(FirstTest.class);
		SecondTest secondTest=annoCtx.getBean(SecondTest.class);
		
		Object obj=annoCtx.getBean("third");
		ThirdTest thirdTest=(ThirdTest)obj;
		
		
		
		firstTest.doTest();
		secondTest.doTest();
		thirdTest.doTest();
		
		System.out.println("------------Accessing Fourth Test Bean--------------");
		FourthTest fourthTest=annoCtx.getBean(FourthTest.class);
		fourthTest.doTest();

		System.out.println("------------Accessing Another Fourth Test Bean--------------");
		AnotherFourthTest anotherFourthTest=annoCtx.getBean(AnotherFourthTest.class);
		anotherFourthTest.doTest();
		
		System.out.println("--------------Accessing Countries using java.util.List-------------------");
		obj=annoCtx.getBean("countries");
		List<String> listOfCountries=(List<String>)obj;
		
		listOfCountries.stream().forEach(cur->System.out.println(cur));
		
	}

}
