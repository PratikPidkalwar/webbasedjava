package ToDo_1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ToDo_1.Dao.CourseDao;
import ToDo_1.Dao.DaoInterface;
import ToDo_1.beans.Course;

/**
 * Servlet implementation class CreateCourseServlet
 */
@WebServlet(name = "myCreateCourseServlet", urlPatterns = { "/createCourse" })
public class CreateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String cour_id=request.getParameter("courseId");
		String cour_title=request.getParameter("courseTitle");
		String cour_provider=request.getParameter("courseProvider");
		String cour_duration=request.getParameter("courseDuration");
		String cour_fees=request.getParameter("course_Fees");
		
		// String to Integer using Integer.parse() method
		
		int course_id=Integer.parseInt(cour_id);
		int course_duration=Integer.parseInt(cour_duration);
		int course_fees=Integer.parseInt(cour_fees);
		
		Course cur=new Course(course_id, cour_title, course_duration, cour_provider, course_fees);
		
		DaoInterface<Course, Integer> idao=new CourseDao();
		
		idao.create(cur);
		
		out.println("<h2>Course Created Successfully...</h2>");
		

	}

}
