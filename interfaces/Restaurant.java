import java.util.*;
abstract class SpiceGrill{
	private String name;
	private String cuisine;
	//Getter and Setter
	public String getName(){
		return name;
	}
	public String getCuisine(){
		return cuisine;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCuisine(String cuisine){
		this.cuisine = cuisine;
	}
	//Constructor
	SpiceGrill(String name, String cuisine){
		this.name = name;
		this.cuisine = cuisine;
	}
	public abstract void display();
}
class OrlandoLocation extends SpiceGrill{
	private int workers;
	//Getter and Setter for workers
	public int getWorkers()	{
		return workers;
	}
	public void setWorkers(int workers){
		this.workers = workers;
	}
	//Constructor for this Orlando Location
	OrlandoLocation(String  name, String cuisine, int workers){
		super(name, cuisine);
		this.workers = workers;
	}
	@Override
	public void display(){
		System.out.println("Name: " + getName() + " Cuisine: " + getCuisine() + " Number of workers: " + workers);
	}
	//Serve Dish Methos Here Add this Later on
	public void serveDish(Dish d){
		d.displayDish();
		System.out.println("Hope you enjoy :)");
	}
}
interface Ispice{
	public int spiceLevel(int lvl);
}
class Dish implements Ispice{
	private String name;
	private int spice;
	//Getter and Setter
	public String getName(){
		return name;
	}
	public int getSpice(){
		return spice;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSpice(int spice){
		this.spice = spice;
	}
	//Constructor of my Dish
	Dish(String name, int spice){
		this.name = name;
		this.spice = spice;
	}
	@Override
	public int spiceLevel(int lvl){
		spice += lvl;
		return spice;
	}
	public void displayDish(){
		System.out.println("Name: " + name + " Spice level: " + spice);
	}
}
public class Restaurant{
	public static void main(String [] args){
		Dish d = new Dish("Rajma", 3);
		OrlandoLocation o = new OrlandoLocation("Spice Grill ORD", "Indian", 15);
		o.display();
		o.serveDish(d);
	}
}
