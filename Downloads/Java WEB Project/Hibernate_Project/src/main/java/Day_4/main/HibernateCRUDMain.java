package Day_4.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Day_4.beans.Restaurant;

public class HibernateCRUDMain {

	private static void createNewRestaurant()
	{
		//Building Configuration Object
				Configuration hibernateConfig = new Configuration();//Looks for hibernate.properties
				//Obtaining SessionFactory
				hibernateConfig = hibernateConfig.configure("hibernate.cfg.xml");//Looks for hibernate.cfg.xml
				SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
				//Obtaining Session
				Session hibernateSession = hibernateFactory.openSession();
				//Creating Entity Class Object
				Restaurant rst = new Restaurant(102, "Hotel Sliversand", "Thai", 7);
				//Obtaining and Starting 'Transaction' using 'Session'
				Transaction hibernateTransaction = hibernateSession.beginTransaction();
				//Attaching the Entity Class Object to the "Session'
					hibernateSession.save(rst);
				//Committing the 'Transaction'
				hibernateTransaction.commit();
				//Closing the Session
				hibernateSession.close();
				//Closing the SessionFactory
				hibernateFactory.close();
				System.out.println("Restaurant created successfully.");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		createNewRestaurant();
	}

}
