import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class CallRestAPI {

	public static void main(String[] args) {
		
		// Stp-1
		Client clt = ClientBuilder.newClient();
		// Stp-2
		WebTarget targ = clt.target("http://localhost:1993/RestDatabaseServiceDemo/student");
		// Stp-3
		String response =targ.request(MediaType.APPLICATION_JSON).get(String.class);
		
		// Stp-4 
		System.out.println(response);
		
		
		

	}

}
