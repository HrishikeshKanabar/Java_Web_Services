package publisher;
import javax.xml.ws.Endpoint;

import Classes.HelloWorldImplmentation;  

public class PublisherHelloWorld {
	
	  
	//Endpoint publisher  
	 public static void main(String[] args) {  
		 Endpoint.publish("http://localhost:1993/ws/hello", new HelloWorldImplmentation());  
	 }  
}
