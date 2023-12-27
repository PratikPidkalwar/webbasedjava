package ToDo_5.main;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ToDo_5.beans.Course;
import ToDo_5.utils.HibernateUtils;


public class Course_HibernateCRUDMain {

	private static Scanner sc=new Scanner(System.in);
	private static int choice;
	
	private static void createNewCourse()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		System.out.println("Enter Details About Courses: ");
		System.out.println("Enter Course ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Course Title: ");
		String title=sc.next();
		System.out.println("Enter Course Durataion: ");
		int duration=sc.nextInt();
		System.out.println("Enter Course Provider: ");
		String provider=sc.next();
		System.out.println("Enter Course Fees: ");
		int fees=sc.nextInt();
		Course course = new Course(id, title, duration, provider, fees);
		
		Transaction hibernateTrans=session.beginTransaction();
			session.save(course);
		hibernateTrans.commit();
	    session.close();
	    factory.close();
	
	    System.out.println("Course Created Successfully.");

	}
	
	private static void showOneRestaurant()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Class<Course> entityClassType=Course.class;
		
		//Serializable entityId=1;
		System.out.println("Enter Course Id To Show Its Details: ");
		int c_id=sc.nextInt();
		
		Serializable entityId=c_id;
		
		Course foundCourse=session.load(entityClassType, entityId);
		System.out.println(foundCourse);
		session.close();
		factory.close();
		
	}
	
	private static void updateRestaurant()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Class<Course> entityClassType=Course.class;
		Serializable entityId=1;
		Course foundCourse=session.load(entityClassType, entityId);
		
		Transaction tx = session.beginTransaction();
			foundCourse.setCourse_Provider("Coursera");
			foundCourse.setCourse_Fees(69000);
		/*
			do {
				System.out.println("Enter Your Choice:");
				System.out.println("1.Update Course Title\n2.Update Course Duration\n3.Update Course Provider\n4.Update Course Fees");
				switch(choice)
				{
				case 1:{
					System.out.println("EENter Course Title:");
					String c_title=sc.next();
					foundCourse.setCourseTitle(c_title);
					break;
				}
				
				case 2:
				{
					System.out.println("Enter Course Duration: ");
					int c_duration=sc.nextInt();
					foundCourse.setCourse_Duration(c_duration);
					break;
				}
				case 3:
				{
					System.out.println("Enter Course Provider: ");
					String c_provider=sc.next();
					foundCourse.setCourse_Provider(c_provider);
					break;
					
				}
				case 4:{
					System.out.println("Enter Course Fees: ");
					int c_fees=sc.nextInt();
					foundCourse.setCourse_Fees(c_fees);
					break;
				}
				case 0:
					System.out.println("Exit.");
					break;
					
				default:
					System.out.println("Wrong Choice!Try Again.");
					break;
				}
			}while(choice!=0);
			*/
			
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record Updated");
	}

	private static void deleteRestaurant()

	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Class<Course> entityClassType=Course.class;
		System.out.println("Enter Course Id to Delete: ");
		int c_id=sc.nextInt();
		
		Serializable entityId=c_id;
		Course foundCourse=session.load(entityClassType, entityId);
		
		Transaction tx=session.beginTransaction();
			session.delete(foundCourse);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record Deleted");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//createNewCourse();
		//showOneRestaurant();
		//updateRestaurant();
		deleteRestaurant();
	}

}
