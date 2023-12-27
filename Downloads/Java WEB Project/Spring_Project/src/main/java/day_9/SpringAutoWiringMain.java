package day_9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAutoWiringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringAutoWireConfig> congicClass=SpringAutoWireConfig.class;
		
		AnnotationConfigApplicationContext annoCtx=new AnnotationConfigApplicationContext(congicClass);
		
		Object carObj=annoCtx.getBean("myCar");
		System.out.println(carObj);

	}

}
