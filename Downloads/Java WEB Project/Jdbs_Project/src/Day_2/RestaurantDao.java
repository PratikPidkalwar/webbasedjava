package Day_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class RestaurantDao implements DoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> getAll() {
		// TODO Auto-generated method stub
		String sqlQuery="select rest_Id,rest_Name,rest_cuisine,rest_Branches from restaurant_master";
		Collection<Restaurant> allRestaurant=new ArrayList<>();
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				Statement stml=conn.createStatement();
				ResultSet rs=stml.executeQuery(sqlQuery);
				)
		{
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String cuisine=rs.getString(3);
				int branchCount=rs.getInt(4);
				
				Restaurant currentRestaurant=new Restaurant(id, name, cuisine, branchCount);
				
				allRestaurant.add(currentRestaurant);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return allRestaurant;
	}

	@Override
	public Restaurant getOne(Integer id) {
		// TODO Auto-generated method stub
		Restaurant foundRestaurant = null;
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				)
		{
			String sqlQuery="select rest_Id,rest_Name,rest_cuisine,rest_Branches from restaurant_master where rest_Id = ?";
			PreparedStatement pstml=conn.prepareStatement(sqlQuery);
			pstml.setInt(1, id);
			ResultSet rs=pstml.executeQuery();
			
			if(rs.next())
			{
				int r_id=rs.getInt(1);
				String name=rs.getString(2);
				String cuisine=rs.getString(3);
				int branchCount=rs.getInt(4);
				
				foundRestaurant=new Restaurant(r_id, name, cuisine, branchCount);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return foundRestaurant;
	}

	@Override
	public void create(Restaurant newRestaurant) {
		// TODO Auto-generated method stub
		String sqlQuery="insert into restaurant_master(rest_Id,rest_Name,rest_cuisine,rest_Branches) values(?,?,?,?)";
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				)
		{
			//Extracting values from the incomin Restaurant Objects
			int id=newRestaurant.getRestaurantId();
			String name=newRestaurant.getName();
			String cuisine=newRestaurant.getCuisine();
			int branchCount=newRestaurant.getBranchCOunt();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, cuisine);
			pstmt.setInt(4, branchCount);
			
			int count=pstmt.executeUpdate();
			System.out.println(count+" Record Inserted.");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

	@Override
	public void deleteOne(Integer id) {
		// TODO Auto-generated method stub
		String sqlQuery="delete from restaurant_master where rest_Id = ?";
		try(
				Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				
				)
		{
			pstmt.setInt(1, id);
			int count=pstmt.executeUpdate();
			System.out.println(count+" Recored Deleted.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Restaurant modifiedRestaurant) {
		// TODO Auto-generated method stub
		String sqlQuery="update restaurant_master set rest_Name = ? ,rest_cuisine = ? ,rest_Branches = ? where rest_Id = ?";

		try(
				Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				)
		{
			int id=modifiedRestaurant.getRestaurantId();
			String name=modifiedRestaurant.getName();
			String cuisine=modifiedRestaurant.getCuisine();
			int branchCount=modifiedRestaurant.getBranchCOunt();
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setString(2, cuisine);
			pstmt.setInt(3, branchCount);
			
			int count=pstmt.executeUpdate();
			System.out.println(count+" record updated.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
