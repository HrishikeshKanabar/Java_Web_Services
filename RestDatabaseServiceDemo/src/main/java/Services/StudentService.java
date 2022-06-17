package Services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;


@Path("/student")
public class StudentService {
	
	public StudentService() {}

	// Configuration method
		public static Session getSession() {
					
					Configuration cfg = new Configuration();
					cfg.configure("hibernate.cfg.xml");
					SessionFactory Factory = cfg.buildSessionFactory();
					Session sess = Factory.openSession();
					return sess;
					
		}
	
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getStudentNamebyId() {
		        
		
				// Get Session 
				 Session sess = StudentService.getSession();
				
				 Student myStudent = sess.get(Student.class,1);
				 return "{firstName:"+myStudent.getFirstName()+"}";
	}
	


}
