package service;

public class AddService {
	
	public int add(int a ,int b) {
		
		return a+b;
		
	}
	
	public String animalType(String animal) {
		String animalType = "";
		if ("Lion".equals(animal)) {
			animalType = "Wild";
		} else if ("Dog".equals(animal)) {
			animalType = "Domestic";
		} else {
			animalType = "I don't know!";
		}
		return animalType;
	}

}
