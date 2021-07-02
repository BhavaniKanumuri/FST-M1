package activities;

interface BicycleParts{
	public int gears=0;
	public int speed=0;
	
}
interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
	
}

class Bicycle implements BicycleParts, BicycleOperations{
	
	public int gears;
	public int currentSpeed;
	public Bicycle(int gears, int currentSpeed) {
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	public void applyBrake(int decrement) {
		currentSpeed-=decrement;
		System.out.println("THe Current Speed is: "+ currentSpeed);
	}
	public void speedUp(int increment) {
		currentSpeed+=increment;
		System.out.println("THe Current Speed is: "+ currentSpeed);
	}
	//Another method
	public String bicycleDesc() {
		return("Number of gears are: "+gears+ " The Speed of the Bicycle is: "+ currentSpeed);
	}
}
	//Derived class
	class MountainBike extends Bicycle{
		public int seatHeight;
        //Constructor method
		public MountainBike(int gears, int currentSpeed, int startHeight) {
			super(gears,currentSpeed);
			seatHeight=startHeight;
		}
		//Adding subclass
		public void setHeight(int newValue) {
			seatHeight=newValue;
		}
		public String bicycleDesc() {
			return (super.bicycleDesc()+ " Seat Height is: "+ seatHeight);
		}
}
public class Activity7 {

	public static void main(String[] args) {
		MountainBike mb=new MountainBike(5,0,25);
		System.out.println(mb.bicycleDesc());
		mb.speedUp(20);
		mb.applyBrake(5);

	}

}
