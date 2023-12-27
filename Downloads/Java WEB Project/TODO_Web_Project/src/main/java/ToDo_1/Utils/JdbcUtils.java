package ToDo_1.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {


	public static Connection buildConnection() throws ClassNotFoundException, SQLException
	{
		String driverClassName="com.mysql.cj.jdbc.Driver";
		Class.forName(driverClassName);
		String connectionUrl="jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false";
		String userId="root";
		String password="Rushi@123";
		
		Connection dbConnection=DriverManager.getConnection(connectionUrl, userId, password);
		
		
		return dbConnection;
		
	}
}
