package TestConnection;

import Services.StudentService;

public class TestService {

	public static void main(String[] args) {
		
		 StudentService obj = new  StudentService();
		 
		 System.out.print(obj.getStudentNamebyId());
		
	}

}
