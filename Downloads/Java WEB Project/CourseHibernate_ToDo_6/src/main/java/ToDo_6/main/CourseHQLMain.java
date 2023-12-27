package ToDo_6.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import ToDo_6.beans.CourseTitleDurationAndProvider;
import ToDo_6.entities.Course;
import ToDo_6.utils.HibernateUtils;

public class CourseHQLMain {

	private static void createCourse()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Course course=new Course(105, "Web Tech", 25, "Coursera", 25000);
		
		Transaction tx=session.beginTransaction();
			session.save(course);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Course Record Added Successfully.");
	}
	
	private static void fromClauseExample()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		String hqlQuery="from Course cs";
		
		Query<Course> hibernateQuery=session.createQuery(hqlQuery);
		List<Course> courseList=hibernateQuery.list();
		
		courseList.stream().forEach((cours)->System.out.println(cours));
		
		session.close();
		factory.close();
	}
	
	private static void selectClauseExample()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		String hqlQuery="select cs.courseTitle,cs.course_Duration,cs.course_Provider from Course cs";
		
		Query<Object[]> hibernateQuery=session.createQuery(hqlQuery);
		List<Object[]> courseDataList=hibernateQuery.list();
		
		for(Object[] courseData : courseDataList)
		{
			Object title=courseData[0];
			Object duration=courseData[1];
			Object provider=courseData[2];
			
			System.out.println(title+" which has Duration of -> "+duration+" Of Provider Name -> "+provider);
			
		}
		
		session.close();
		factory.close();
	}
	
	private static void constructorExpressionExample()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		String hqlQuery="select new ToDo_6.beans.CourseTitleDurationAndProvider(cs.courseTitle,cs.course_Duration,cs.course_Provider) from Course cs";
		
		Query<CourseTitleDurationAndProvider> hibernateQuery=session.createQuery(hqlQuery);
		List<CourseTitleDurationAndProvider> courseList=hibernateQuery.list();
		
		for(CourseTitleDurationAndProvider courseData : courseList)
			System.out.println(courseData);
		
		session.close();
		factory.close();
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//createCourse();
		//fromClauseExample();
		//selectClauseExample();
		constructorExpressionExample();
	}

}
