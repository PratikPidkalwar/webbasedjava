package Day_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driverClassMain="com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverClassMain);
			System.out.println("Driver Loaded.");
			String connectionUrl="jdbc:mysql://localhost:3306/cdac_nov_23";
			String userId="root";
			String password="Rushi@123";
			
			Connection dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("Connection to DB");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
