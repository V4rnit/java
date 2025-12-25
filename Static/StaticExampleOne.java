import java.util.*;
class HondaCity{
	//Static memmbers are Shared by each an every instance of an object so Changes made to this from any class
	//will be reflected in all the classes

	static long price = 1000000;
	public int tires;
	public int engine;
	//I can only show the static fields inside a static method Since i do not need to create an object of the class itself first
	public static void getPrice(){
		System.out.println(price);
	}
	public void displayInfo(){
		System.out.println("Price: " + price + " Tires: " + tires + " Engine: " + engine);
	}
}
public class StaticExampleOne{
	public static void main(String [] args){
		//Not creating an object first Also 
		System.out.println(HondaCity.price);
		HondaCity.getPrice();
		//But now in order to use the displayInfo Method i need to create and object of type HondaCity first
		HondaCity c = new HondaCity();
		c.tires = 4;
		c.engine = 2;
		c.displayInfo();
	}
}
