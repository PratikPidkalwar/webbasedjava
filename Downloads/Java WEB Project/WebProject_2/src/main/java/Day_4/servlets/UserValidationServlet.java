package Day_4.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Day_4.beans.User;
import Day_4.beans.userValidator;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet(name = "myUserValidationServlet", urlPatterns = { "/isValid" })
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("uid");
		String password=request.getParameter("pwd");
		
		User appUser=new User(username, password);
		
		boolean valid = userValidator.isValid(appUser);
		
		if(valid)
			out.println("<h2 style='color:green'>Congratulations!! , You are IN.</h2>");
		else	
			out.println("<h2 style='color:red'>Sorry, Access Denied Due to Invalid credentilas.</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
