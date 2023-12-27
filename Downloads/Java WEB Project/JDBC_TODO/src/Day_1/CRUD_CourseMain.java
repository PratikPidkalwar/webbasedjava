package Day_1;

import java.util.Collection;

public class CRUD_CourseMain {

	private static void showOneCourse()
	{
		DaoInterface<Course, Integer> idao=new CourseDao();

		Course crs=idao.getOne(103);
		
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showAllCourses();
		showOneCourse();
	}

}
