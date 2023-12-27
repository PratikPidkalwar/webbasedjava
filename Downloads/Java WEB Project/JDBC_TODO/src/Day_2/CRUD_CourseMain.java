package Day_2;

import java.util.Collection;
import java.util.Scanner;

public class CRUD_CourseMain {

	private static Scanner sc=new Scanner(System.in);
	private static int ch;
	
	private static void showOneCourse()
	{
		DaoInterface<Course, Integer> idao=new CourseDao();

		System.out.println("Enter Course Id to Show its Course Details.");
		int c_id=sc.nextInt();
		
		Course crs=idao.getOne(c_id);
		
		if(crs!=null)
			System.out.println(crs);
		else
			System.out.println("Course with this Id Is Not Present.");
		
	}
	
	private static void showAllCourses()
	{
		DaoInterface<Course, Integer> idao=new CourseDao();
		Collection<Course> allAvailableCourses=idao.getAll();
		
		allAvailableCourses.stream().forEach((crs->System.out.println(crs)));
		
	}
	
	private static void createNewCourse()
	{
		DaoInterface<Course, Integer> idao=new CourseDao();
		
		System.out.println("Enter Details Of Course:");
		System.out.println("Enter Course Id");
		int c_id=sc.nextInt();
		System.out.println("Enter Course Title:");
		String c_title=sc.next();
		System.out.println("Enetr Course Duration:");
		int c_duration=sc.nextInt();
		System.out.println("Enter Course Provider:");
		String c_provider=sc.next();
		System.out.println("Enter Course Fees:");
		int c_fees=sc.nextInt();
		sc.nextLine();
		
		Course cur = new Course(c_id, c_title, c_duration, c_provider, c_fees);
		
		idao.create(cur);
	}
	
	private static void deleteCourse()
	{
		DaoInterface<Course, Integer> idao=new CourseDao();
		
		System.out.println("Enter Course Id to Delete Record of it.");
		int c_id=sc.nextInt();
		
		idao.deleteOne(c_id);
		
	}
	
	private static void updateCourse()
	{
		DaoInterface<Course, Integer> idao=new CourseDao();
		
		System.out.println("Enter Course Id to Update Record Of It.");
		int c_id=sc.nextInt();
		Course currentCourse=idao.getOne(c_id);
		
		
		do{
			System.out.println("Enter Your Choice To Update Record.");
			System.out.println("1.Course Title\n2.Course Duration\n3.Course Provider\n4.Course Fees\n5.Stop the Update");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter Course title To Update:");
				String c_Title=sc.next();
				
				currentCourse.setCourseTitle(c_Title);
				
				break;
			}
			
			case 2:
			{
				System.out.println("Enter Course Duration To Update:");
				int c_duration=sc.nextInt();
				
				currentCourse.setCourse_Duration(c_duration);
				
				break;
			}
			
			case 3:
			{
				System.out.println("Enter Course Provider To Update:");
				String c_provider=sc.next();
				
				currentCourse.setCourse_Provider(c_provider);
				
				break;
			}
			
			case 4:
			{
				System.out.println("Enter Course Fees To Update:");
				int c_fees=sc.nextInt();
				
				currentCourse.setCourse_Fees(c_fees);
				
				break;
				
			}
			
			case 5:
				System.out.println("Update Stops.");
				break;
				
			default:
				System.out.println("Wrong Choice.");
				break;
			}
			
			idao.update(currentCourse);
		}while(ch!=5);
		
		
		//currentCourse.setCourse_Duration(33);
		//currentCourse.setCourse_Provider("JavaTpoint");
		
		//idao.update(currentCourse);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		//showAllCourses();
		//showOneCourse();
		//createNewCourse();
		//deleteCourse();
		//updateCourse();
		do {
			System.out.println("Enter Your Choice to do CRUD Operation.");
			System.out.println("1.Show All Courses.\n2.Show One Course.\n3.Create New Course.\n4.Delete Course.\n5.Update Course.\n6.Exit");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				showAllCourses();
				break;
				
			case 2:
				showOneCourse();
				break;
				
			case 3:
				createNewCourse();
				break;
				
			case 4:
				deleteCourse();
				break;
				
			case 5:
				updateCourse();
				break;
				
			case 6:
				System.out.println("End Of the CRUD Operation.");
				break;
				
			default:
				System.out.println("Wrong Choice. Try Again.");
				break;
			}
		}while(choice!=6);
	}

}
