package Day_7.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Day_7.entities.Restaurant;
import Day_7.utils.HibernateUtils;

public class HibernateAnnotationMain {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		
		Restaurant rst=new Restaurant(134, "Taj Hotel", "Indian", 5);
		Transaction tx=session.beginTransaction();
			session.save(rst);
			
		tx.commit();
		session.clear();
		factory.close();
		System.out.println("Record Added.");
	}

}
