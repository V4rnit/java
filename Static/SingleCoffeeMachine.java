//Aim of this assignment is to create a Coffe machine for an office this office will have a max 
//of 2 coffe machine no more than that. (I will implement a private constructor for this and)
import java.util.*;
class CoffeeMachine{
	private float water;
	private float milk;
	private float sugar;
	private float coffeePowder;
	//Number of max coffe machines my office can have
	static private int count = 0;
	//A reference to the coffe machine initailly null
	static private CoffeeMachine [] m = new CoffeeMachine [2];
	
	//Getter 
	public float getWater()	{
		return water;
	}
	public float getMilk(){
		return milk;
	}
	public float getSugar(){
		return sugar;
	}
	public float getCoffeePowder(){
		return coffeePowder;
	}
	//Setter
	public void floatSetWater(float water){
		//water cannot exceed the limit of 5 liters
		if(water < 5 && water > 0){
			this.water = water;
		}
	}
	public void setMilk(float milk){
		//milk cannot exceed 3 liters
		if(milk < 3 & milk > 0){
			this.milk = milk;
		}
	}
	public void setSugar(float sugar){
		//sugar cannot exceed 1 liter
		if(sugar < 1 & sugar > 0){
			this.sugar = sugar;
		}
	}
	public void setCoffeePowder(float coffeePowder){
		//cannot exceed 1 liter
		if(coffeePowder < 1 && coffeePowder > 0){
			this.coffeePowder = coffeePowder;
		}
	}
	//Default constructor 
	private CoffeeMachine(){
		this.water = 1;
		this.milk = 1;
		this.sugar = 1;
		this.coffeePowder = 1;
	}
	//Now i will create an instance of this CoffeeMachine and make sure that my office can have no more than 2 coffee machine
	static public CoffeeMachine makeMachine(){
		if(count < 2){
			m[count] = new CoffeeMachine();
			return m[count++];
		}
		return null;
	}
	public void display(){
		System.out.println("Your coffee is ready !!!");
	}
}
public class SingleCoffeeMachine{
	public static void main(String [] args){
		CoffeeMachine c1 = CoffeeMachine.makeMachine();
		CoffeeMachine c2 = CoffeeMachine.makeMachine();
		c1.display();
		c2.display();
	}
}
