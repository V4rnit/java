import java.util.*;
class Car{
	public void start(){
		System.out.println("Car started");
	}
	public void stop(){
		System.out.println("The car is stopped");
	}
	public void changeGear(){
		System.out.println("The gear is Changed");
	}
}
class LuxuaryCar extends Car{
	@Override
	public void changeGear(){
		System.out.println("This is an automatic Car");
	}
	public void openRoof(){
		System.out.println("The Roof is open");
	}
}
public class carMethodOverriding{
	public static void main(String [] args){
		//Creating a Car Object
		Car c = new Car();
		c.start();
		c.stop();
		c.changeGear();

		//Creating a Luxury Car Object
		LuxuaryCar cc = new LuxuaryCar();
		cc.start();
		cc.stop();
		cc.changeGear();
		cc.openRoof();
	}
}
