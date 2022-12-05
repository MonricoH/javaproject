package twoconstructorjava;

public class Car {
	String model;
	String color;
	int seats;
	int doors;
	
	public Car() {
		this.model = "Generic";
		this.color = "White";
		this.seats = 4;
		this.doors = 4;
		System.out.println("Empty");
	}
	
	public Car(String model, String color, int seats, int doors) {
		this.model = model;
		this.color = color;
		this.seats = seats;
		this.doors = doors;
		System.out.println("Not Empty");
		
		
	}
	
	
	
	
	
}


