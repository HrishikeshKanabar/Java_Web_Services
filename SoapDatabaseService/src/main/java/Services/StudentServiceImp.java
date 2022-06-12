package Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Student;



public class StudentServiceImp {
	
	public StudentServiceImp() {}

	// Configuration method
		public static Session getSession() {
					
					Configuration cfg = new Configuration();
					cfg.configure("hibernate.cfg.xml");
					SessionFactory Factory = cfg.buildSessionFactory();
					Session sess = Factory.openSession();
					return sess;
					
		}
	
		
    
	public String getStudentNamebyId(int id) {
		        
		
				// Get Session 
				 Session sess = StudentServiceImp.getSession();
				
				 Student myStudent = sess.get(Student.class,id);
				 return myStudent.getFirstName();
	}
	


}
