package ToDo_4.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ToDo_4.beans.Course;

public class CourseHibernateCRUDMain {

	private static void createNewCourse()
	{
		//Building Configuration Object
		Configuration hibernateConfig=new Configuration();
		
		//Obtaining Session Factory
		hibernateConfig=hibernateConfig.configure();
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		//Obtaining Session
		Session hibernateSession=hibernateFactory.openSession();
		
		//Create Entity class Object
		//Course course=new Course(1, "Java", 65, "Udemy", 55000);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Information About Courses: ");
		System.out.println("Enter Course ID: ");;
		int id=sc.nextInt();
		System.out.println("Enter Course Title: ");
		String title=sc.next();
		System.out.println("Enter Course Duration: ");
		int durtion=sc.nextInt();
		System.out.println("Enter Course Provider: ");
		String provider=sc.next();
		System.out.println("Enter Course Fees: ");
		int fees=sc.nextInt();	
		Course course=new Course(id, title, durtion, provider, fees);
		
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		
		hibernateSession.save(course);
		hibernateTransaction.commit();
		
		hibernateSession.close();
		hibernateFactory.close();
		
		System.out.println("Course Created Successfully");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createNewCourse();
		
	}

}
