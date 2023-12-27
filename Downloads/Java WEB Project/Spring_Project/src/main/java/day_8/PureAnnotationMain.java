package day_8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<SpringConfig> configUnit=SpringConfig.class;
		
		AnnotationConfigApplicationContext annoCtx=new AnnotationConfigApplicationContext(configUnit);
		
		Class<Test> testRef=Test.class;
		Test testObj=annoCtx.getBean(testRef);
		testObj.doTest();
	}

}
