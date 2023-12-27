package Day_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class CourseDao implements DaoInterface<Course, Integer> {

	@Override
	public Collection<Course> getAll() {
		// TODO Auto-generated method stub
		String sqlQuery="select course_Id,course_Title,course_duration,course_Provider,course_Fees from course_master";
		Collection<Course> allCourse=new ArrayList<>();
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sqlQuery);
				)
		{
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int duration=rs.getInt(3);
				String provider=rs.getString(4);
				int fees=rs.getInt(5);
				
				Course currentCourse=new Course(id, name, duration, provider, fees);
				
				allCourse.add(currentCourse);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return allCourse;
	}

	@Override
	public Course getOne(Integer id) {
		// TODO Auto-generated method stub
		Course foundCourse=null;
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				)
		{
			String sqlQuery="select course_Id,course_Title,course_duration,course_Provider,course_Fees from course_master where course_Id = ?";
			
			PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				int c_id=rs.getInt(1);
				String c_name=rs.getString(2);
				int c_duration=rs.getInt(3);
				String c_provider=rs.getString(4);
				int c_fees=rs.getInt(5);
				
				foundCourse=new Course(c_id, c_name, c_duration, c_provider, c_fees);
			}

			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		return foundCourse;
	}

	@Override
	public void create(Course newCourse) {
		// TODO Auto-generated method stub
		String sqlQuery="insert into course_master(course_Id,course_Title,course_duration,course_Provider,course_Fees) values(?,?,?,?,?)";
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				)
		{
			
			int id=newCourse.getCourseId();
			String name=newCourse.getCourseTitle();
			int duration=newCourse.getCourse_Duration();
			String provider=newCourse.getCourse_Provider();
			int fees=newCourse.getCourse_Fees();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, duration);
			pstmt.setString(4, provider);
			pstmt.setInt(5, fees);
			
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
		String sqlQuery="delete from course_master where course_Id = ?";
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				)
		{
			
			pstmt.setInt(1, id);
			int count= pstmt.executeUpdate();
			System.out.println(count+" Record Deleted.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Course modifiedCourses) {
		// TODO Auto-generated method stub
		String sqlQuery="update course_master set course_Title = ? ,course_duration = ? ,course_Provider = ? ,course_Fees = ? where course_Id = ?";
		
		try(
				Connection conn=JdbcUtils.buildConnection();
				PreparedStatement pstmt=conn.prepareStatement(sqlQuery);
				)
		{
			
			int c_id=modifiedCourses.getCourseId();
			String c_name=modifiedCourses.getCourseTitle();
			int c_duration=modifiedCourses.getCourse_Duration();
			String c_provider=modifiedCourses.getCourse_Provider();
			int c_fees=modifiedCourses.getCourse_Fees();
			
			pstmt.setInt(5, c_id);
			pstmt.setString(1, c_name);
			pstmt.setInt(2, c_duration);
			pstmt.setString(3, c_provider);
			pstmt.setInt(4, c_fees);
			
			int count=pstmt.executeUpdate();
			System.out.println(count+" Record Updated.");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
