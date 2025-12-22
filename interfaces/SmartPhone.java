import java.util.*;

abstract class Phone{
	private double price;
	abstract public void call();
	abstract public void message();
	abstract public void displayPrice();
	//Getter
	public double getPrice(){
		return price;
	}
	//No need for a setter Price is determined during production time
	//Constructor
	Phone(double price){
		this.price = price;
	}
}
interface Icamera{
	public void click();
}
interface ImusicPlayer{
	public void play();
}
//SmartPhone IS A PHONE that CAN DO Icamera and ImusicPlayer
class smartPhone extends Phone implements Icamera, ImusicPlayer{

	smartPhone(double price){
		super(price);
	}

	@Override
	public void call(){
		System.out.println("Making a call");
	}
	@Override
	public void message(){
		System.out.println("Messaging");
	}
	@Override
	public void displayPrice(){
		System.out.println("The cost is: " + getPrice());
	}
	@Override
	//Method of interface Icamera
	public void click(){
		System.out.println("Taking a picture");
	}
	@Override
	//Method of the interface ImusicPlayer
	public void play(){
		System.out.println("Playing Music");
	}

}

public class SmartPhone{
	public static void main(String [] args){
		smartPhone s = new smartPhone(999.99);
		s.call();
		s.message();
		s.click();
		s.play();
		s.displayPrice();
	}
}
