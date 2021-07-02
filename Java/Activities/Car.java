package activities;

public class Car {
	//Variables
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	//Constructor
	Car(){
			tyres=4;
			doors=4;
	}
	
	//Class Methods
	public void displayCharacteristics() {
		System.out.println("Color of the car is: "+color);
		System.out.println("Transmission of the car is: "+transmission);
		System.out.println("Make of the car is: "+make);
		System.out.println("Number of the tyres are: "+tyres);
		System.out.println("Number of the doors are: "+doors);
		
	}
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped");
	}

}
