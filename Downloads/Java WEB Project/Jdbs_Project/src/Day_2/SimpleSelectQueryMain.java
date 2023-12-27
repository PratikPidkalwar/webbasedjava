package Day_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverClassMain="com.mysql.cj.jdbc.Driver";
		Connection dbConnection=null;
		Statement stml=null;
		ResultSet rs=null;
		
		try {
			Class.forName(driverClassMain);
			System.out.println("Driver Loaded.");
			String connectionUrl="jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false";
			String userId="root";
			String password="Rushi@123";
			
			dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("Connection to DB");
			
			// Obtaining Statement
			stml = dbConnection.createStatement();
			
			//Executing SQL Query.
			
			String sqlQuery="select rest_Name,rest_cuisine,rest_Branches from restaurant_master";
			rs = stml.executeQuery(sqlQuery);
			
			while(rs.next())
			{
				// Reading the values
				String name=rs.getString(1);
				String cuisine=rs.getString(2);
				int branchesCount=rs.getInt(3);
				System.out.println(name+" , "+cuisine+" , "+branchesCount);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			// closing all connections.
			try {
				rs.close();
				stml.close();
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
