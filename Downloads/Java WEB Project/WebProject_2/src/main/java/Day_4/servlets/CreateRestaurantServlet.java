package Day_4.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Day_4.Dao.DoInterface;
import Day_4.Dao.RestaurantDao;
import Day_4.beans.Restaurant;

/**
 * Servlet implementation class CreateRestaurantServlet
 */
@WebServlet(name = "myCreateRestaurantServlet", urlPatterns = { "/createRestaurant" })
public class CreateRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String rest_id=request.getParameter("restaurantId");
		String rest_name=request.getParameter("restaurantName");
		String rest_cuisine=request.getParameter("restaurantCuisine");
		String rest_branches=request.getParameter("restaurantBranchCount");
		
		// String to Integer using Integer.parse() method
		
		int r_id=Integer.parseInt(rest_id);
		int r_br_count=Integer.parseInt(rest_branches);
		
		Restaurant rst=new Restaurant(r_id, rest_name, rest_cuisine, r_br_count);
		
		DoInterface<Restaurant, Integer> idao=new RestaurantDao();
		
		idao.create(rst);
		
		out.println("<h2>Restaurant Created Successfully...</h2>");
		
		
	}

}
