package TestHibernate.HibernateUtils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import TestHibernate.Bean.Customer;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		
		System.out.println("Configuring Hibernate Programatically ");
		Configuration cfg = new Configuration();
		
		Class<Customer> cst = Customer.class;
		cfg.addAnnotatedClass(cst);
		
		Properties prop = new Properties();
		
		prop.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		prop.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/madan_database?useSSL=false");
		prop.setProperty("hibernate.connection.username","root");
		prop.setProperty("hibernate.connection.password","root");
		
		prop.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		prop.setProperty("hibernate.show_sql","true");
		prop.setProperty("hibernate.hbm2ddl.auto","update");
		
		cfg.setProperties(prop);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		return sf;
		
		
	}
	
}
