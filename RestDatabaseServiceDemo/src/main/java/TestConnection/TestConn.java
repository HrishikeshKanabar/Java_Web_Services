package TestConnection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConn {

	public static void main(String[] args) {
		
		// Step-1 Configuration
		
		Configuration cfg = new Configuration();
		
		// Step-2  Where to take database credentials
		
		cfg.configure("hibernate.cfg.xml");
		
		// Step- 3 get session factory
		
		SessionFactory Factory = cfg.buildSessionFactory();
		
		
		
		System.out.println("Connection Success !! " + Factory);
	}
	

}
