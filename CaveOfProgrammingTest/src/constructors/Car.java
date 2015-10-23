package constructors;

public class Car {
	
	String name;
	
	public Car (String newName){
		name = newName;
	}
	
	public void start() {
		System.out.println("Car started");
	}

	public String getName(){
		return name;
	}
}
