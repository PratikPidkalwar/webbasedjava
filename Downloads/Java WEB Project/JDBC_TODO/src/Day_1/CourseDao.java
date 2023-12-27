package Day_1;

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

}
