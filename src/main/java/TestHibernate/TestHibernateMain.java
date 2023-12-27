package TestHibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import TestHibernate.Bean.Customer;
import TestHibernate.HibernateUtils.HibernateUtils;

public class TestHibernateMain {

	public static void insertData() {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Customer cst = new Customer(1, "MAdan", "Pune", 546231);
		Transaction tx = session.beginTransaction();
		session.save(cst);
		tx.commit();
		System.out.println("Record Inserted Successfully >> ");
		session.close();
		sf.close();
	}
	
	public static void updateData() {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Class<Customer> cst = Customer.class;
		Serializable id = 1;
		Customer customer = session.load(cst, id);
		System.out.println(customer);

		customer.setCustomerCity("Mumbai");
		customer.setPhoneNo(1234564567);
		tx.commit();
		System.out.println("Record Updated Successfully ");
		session.close();sf.close();	
	}
	public static void readData() {
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Class<Customer> cst = Customer.class;
		Serializable id = 1;
		Customer customer = session.load(cst, id);
		System.out.println(customer);
		
		
	}
	public static void insertMultipleData(){
		
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer(2, "Garry", "Latur", 456789));
		list.add(new Customer(3, "Sagar", "Nashik", 554585));
		list.add(new Customer(4, "Pratik", "Nagpur", 123546875));
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		for (Customer customer : list) {
			session.save(customer);
		}
		tx.commit();
		
		session.close();
		sf.close();
		System.out.println("INserted successfully multiple values ");
		
		
	}
	
	public static void main(String[] args) {
		
		//insertData();
		//updateData();
		//readData();
		
		insertMultipleData();
	}
	
}
