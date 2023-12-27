package Day_7.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import Day_7.beans.RestaurantNameAndBranches;
import Day_7.entities.Restaurant;
import Day_7.utils.HibernateUtils;

public class HQLMain {

	private static void fromClouseExample()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		//Building HQL Query
		String hqlQuery="from Restaurant rs";
		//Obtaining a reference of type 'Query'
		Query<Restaurant> hibernateQuery=session.createQuery(hqlQuery);
		
		//Obtaining List of Restaurant
		List<Restaurant> restaurantList=hibernateQuery.list();
		
		restaurantList.stream().forEach((rst)->System.out.println(rst));
		
		session.close();
		factory.close();
		
	}
	
	private static void selectClouseExample()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		String sqlQuery="select rs.name,rs.branchCount from Restaurant rs";
		
		Query<Object[]> hibernateQuery=session.createQuery(sqlQuery);
		List<Object[]> restaurantDataList=hibernateQuery.list();
		
		for(Object[] restaurantData:restaurantDataList)
		{
			Object restName=restaurantData[0];
			Object restCount=restaurantData[1];
			System.out.println(restName+" has "+restCount+" branches.");
		}
		session.clear();
		factory.close();
	}
	
	private static void constructorExpressionExample()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		String hqlQuery="select new Day_7.beans.RestaurantNameAndBranches(rs.name,rs.branchCount) from Restaurant rs";
		
		Query<RestaurantNameAndBranches> hibernateQuery=session.createQuery(hqlQuery);
		List<RestaurantNameAndBranches> restaurantList=hibernateQuery.list();
		
		for(RestaurantNameAndBranches data:restaurantList)
			System.out.println(data);
		
		session.close();
		factory.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fromClouseExample();
		//selectClouseExample();
		
		constructorExpressionExample();
	}

}
