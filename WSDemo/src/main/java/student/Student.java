package student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class Student {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return "{return:Hello}";
	}

}
