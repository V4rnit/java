import java.util.*;
class Phone{
	private String name;
	private String modelNo;
	private double price;
	private  String color;
	private String OS;
	
	//Getter
	public String getName(){
		return name;
	}
	public String getModelNo(){
		return modelNo;
	}
	public double getPrice(){
		return price;
	}
	public String getColor(){
		return color;
	}
	public String getOS(){
		return OS;
	}
	//Setters
	public void setColor(String color){
		this.color = color;
	}
	public void setOS(String OS){
		this.OS = OS;
	}
	//Constructor for Phone
	Phone(String name, String modelNo, double price){
		this.name = name;
		this.modelNo = modelNo;
		this.price = price;
	}
	//Method to print the device type and all the information
	public void display(){
		System.out.println("Phone:");
		System.out.println("Name: " + name + " ,Model Number: " + modelNo + " ,Price: " + price
				    + " ,Color: " + color + " ,Operating System: " + OS);
	}
}
class Ipad extends Phone{
	private boolean service;
	//Getter and Setter for service
	public boolean getService(){
		return service;
	}
	public void setService(boolean service){
		this.service = service;
	}
	//Constructor
	Ipad(String name, String modelNo, double price){
		super(name, modelNo, price);
	}
	//Overidden method for an Ipad (Polymorphism)
	@Override
	public void display(){
		System.out.println("Ipad:");
		System.out.println("Name: " +getName()+ " ,Model Number: " + getModelNo()+ " ,Price: " + getPrice()
				    + " ,Color: " + getColor() + " ,Operating System: " + getOS());
	}
}
public class DesignPhone{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//Creating a Phone
		Phone p = new Phone("xx", "9991", 599.99);
		//Asking the user for which OS they would want
		System.out.println("Please enter the Operating System you want for your phone:");
		String userOs = sc.nextLine();
		p.setOS(userOs);
		//Ask user for phone Color
		System.out.println("Which color would you like for your phone; ");
		String userColor = sc.nextLine();
		p.setColor(userColor);

		//Display the Phone to the user
		p.display();

		//Creating an Ipad
		Ipad ip = new Ipad("11xx", "100932", 899.99);
		System.out.println("Please enter the operatin system you want for your Ipad:");
		String ipadOs = sc.nextLine();
		System.out.println("Which color would you like for your phone; ");
		String ipadColor = sc.nextLine();
		System.out.println("Would you like service: ");
		boolean ipadService = sc.nextBoolean();
		ip.setOS(ipadOs);
		ip.setColor(ipadColor);
		ip.setService(ipadService);
		ip.display();
		sc.close();
	}
}
