import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test_Main {

	public static void createTable() {
		
		try {
			Connection cn = Jdbc_MainClass.getConnection();
			
			String query = "CREATE TABLE Persons("
					+ "    PersonID int,"
					+ "    LastName varchar(255),"
					+ "    FirstName varchar(255),"
					+ "    Address varchar(255),"
					+ "    City varchar(255)"
					+ ");";
			
			Statement stmt = cn.createStatement();
			
			stmt.execute(query);
			
			System.out.println("Table Created Successfully ");
				
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertData() {
		try {
			Connection cnn = Jdbc_MainClass.getConnection();
			
			String query = "INSERT INTO persons (PersonID, LastName, FirstName, Address, City) VALUES (?, ?, ?, ?, ?)";		
			
			PreparedStatement stmt = cnn.prepareStatement(query);
			
			Person person = new Person(1, "Bura", "MAdan", "SOlapur", "Solapur");
			
			stmt.setInt(1, person.getPersonId());
			stmt.setString(2, person.getLastName());
			stmt.setString(3, person.getFirstName());
			stmt.setString(4, person.getAddress());
			stmt.setString(5, person.getCity());
			
			 int i = stmt.executeUpdate();
			System.out.println(i+" records inserted >> ");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void insertMultipleData() {  
		
		
		try {
			List<Person> list = new ArrayList<Person>();  
			
			list.add(new Person(2, "Pawar", "Garry", "Mumbai", "LAtur"));
			list.add(new Person(3, "TOny", "Stark", "Mumbai", "Solapur"));
			list.add(new Person(4, "Captain", "America", "Mumbai", "America"));
			list.add(new Person(5, "Rohit", "Sharma", "Delhi", "Mumbai"));
			list.add(new Person(6, "Virat", "kohli", "Mumbai", "Banglore"));
			
			
			Connection cnn = Jdbc_MainClass.getConnection();
			String query = "INSERT INTO persons (PersonID, LastName, FirstName, Address, City) VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement stmt = cnn.prepareStatement(query);
			for(Person p : list) {
				int i =0;
				stmt.setInt(1, p.getPersonId());
				stmt.setString(2, p.getLastName());
				stmt.setString(3, p.getFirstName());
				stmt.setString(4, p.getAddress());
				stmt.setString(5, p.getCity());
				
				

				  i = stmt.executeUpdate();	
			}
			
			System.out.println("All records inserted >> ");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void updateData() {
		
		try {
			Connection cnn = Jdbc_MainClass.getConnection();
			
			String sqlQ = "Update persons Set Address=? where PersonID=?";
			
			PreparedStatement stmt = cnn.prepareStatement(sqlQ);
			
			stmt.setString(1, "Mumbai");
			stmt.setInt(2, 1);
			
			stmt.executeUpdate();
			
			System.out.println("Record Successfully Updated ");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void deleteData() {
		
		try {
			Connection cnn = Jdbc_MainClass.getConnection();
			
			String query = "delete from persons where PersonID=?";
			
			PreparedStatement stmt = cnn.prepareStatement(query);
			
			stmt.setInt(1, 1);
			
			stmt.executeUpdate();
			
			System.out.println("Record Deleted Successfully ");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void readData()
	{
			try {
				Connection cnn = Jdbc_MainClass.getConnection();
				
				String query = "select * from persons ";
				Statement stmt = cnn.createStatement();
				
				ResultSet rs=stmt.executeQuery(query);
	
				if(rs.next()) {
					int personID = rs.getInt(1);
					String lastName = rs.getString(2);
					String firstName = rs.getString(3);
					String address = rs.getString(4);
					String city = rs.getString(5);
					
					
					Person person = new Person(personID, lastName, firstName, address, city);
					
					System.out.println(person);
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void readAllData() {
		
		try {
			Connection cnn = Jdbc_MainClass.getConnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		//createTable();
		// insertData();
		// updateData();
		//deleteData();
		//readData();
		
		insertMultipleData();
	}

}
