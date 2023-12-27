package Day_6.main;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Day_6.beans.Restaurant;
import Day_6.utils.HibernateUtils;

public class HibernateCRUDMain {

	private static Scanner sc=new Scanner(System.in);
	
	private static void createNewRestaurant()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		//Restaurant rst=new Restaurant(1, "Hotel SilverSand", "Thai", 7);
		System.out.println("Enter Details About Restaurant: ");
		System.out.println("Enter Restaurant ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Restaurant Name: ");
		String name=sc.next();
		System.out.println("Enter Restaurant Cuisine: ");
		String cuisine=sc.next();
		System.out.println("Enter Restaurant Branches: ");
		int branch_count=sc.nextInt();
		Restaurant rst=new Restaurant(id, name, cuisine, branch_count);
		
		Transaction hibernateTrans=session.beginTransaction();
		
			session.save(rst);
		hibernateTrans.commit();
		session.close();
		factory.close();
		
		System.out.println("Restaurant Created Successfully.");
	}
	
	private static void showOneRestaurant()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Class<Restaurant> entityClassType=Restaurant.class;
		
		Serializable entityId=1;
		
		Restaurant foundRestaurant=session.load(entityClassType, entityId);
		System.out.println(foundRestaurant);
		session.close();
		factory.close();
		
	}
	
	private static void updateRestaurant()
	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Class<Restaurant> entityClassType=Restaurant.class;
		Serializable entityId=1;
		Restaurant foundRestaurant=session.load(entityClassType, entityId);
		
		Transaction tx = session.beginTransaction();
			foundRestaurant.setCuisine("Oriental");
			foundRestaurant.setBranchCOunt(19);
			
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record Updated");
	}
	
	private static void deleteRestaurant()

	{
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Class<Restaurant> entityClassType=Restaurant.class;
		Serializable entityId=1;
		Restaurant foundRestaurant=session.load(entityClassType, entityId);
		
		Transaction tx=session.beginTransaction();
			session.delete(foundRestaurant);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record Deleted");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createNewRestaurant();
		//showOneRestaurant();
		//updateRestaurant();
		deleteRestaurant();
	
	}

}
