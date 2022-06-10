package Classes;

import javax.jws.WebService;

import interfaces.HelloWorld;
//Service Implementation  

@WebService(endpointInterface = "Classes.HelloWorld")  
public class HelloWorldImplmentation implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		 return "Hello World JAX-WS " + name;  
	}
    
}
