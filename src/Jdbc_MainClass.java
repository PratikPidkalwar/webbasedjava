

import java.sql.*;

public class Jdbc_MainClass 


{
public static Connection getConnection() throws ClassNotFoundException, SQLException {     
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName = "root";
		String pass = "root";
		
		Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/madan_database", userName, pass); 
	
		return cnn;
	
	}

}
