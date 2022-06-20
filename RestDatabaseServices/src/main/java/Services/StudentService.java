package Services;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String createStudent(Student std) {
		
		StudentServiceDemo stdServ = new StudentServiceDemo();
		stdServ.createStudent(std.getFirstName(), std.getLastName(),std.getEmail(),std.getPhone());
		return "{message:'Record Created Successfully !!'}";
	}
	
	@PUT
    @Produces({ MediaType.APPLICATION_JSON })
    public String updateEmployee(Student std) {
		StudentServiceDemo stdServ = new StudentServiceDemo();
		stdServ.update(std.getId(), std.getEmail());
		return "{message:"+"Updated Student with Id "+std.getId()+ "}";
    }
	
	
	@DELETE
    @Path("/{stdId}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public String deleteEmployee(@PathParam("stdId") int stdId) {
		StudentServiceDemo stdServ = new StudentServiceDemo();
		stdServ.deleteStudent(stdId);
		return "{message:"+"Deleted Student with Id "+stdId+ "}";
    }

}
