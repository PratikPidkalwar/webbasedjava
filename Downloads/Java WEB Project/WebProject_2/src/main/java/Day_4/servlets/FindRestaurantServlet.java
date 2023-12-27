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
 * Servlet implementation class FindRestaurantServlet
 */
@WebServlet(name = "myFindRestaurantServlet", urlPatterns = { "/findRestaurant" })
public class FindRestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String rest_id=request.getParameter("restaurantId");
		
		
		int r_id=Integer.parseInt(rest_id);
				
		
		DoInterface<Restaurant, Integer> idao=new RestaurantDao();
		
		Restaurant rst = idao.getOne(r_id);
		
		out.println("<h2>Restaurant Find Successfully...</h2>");
		
		out.println(rst.getName());
		
		
	}

}
