package zoo;
import java.util.*;

public class main{
	public static void main(String [] args){
		try{
		Lion l1 = new Lion("Tig", "Mammal", 12, "Male");
		Lion l2 = new Lion("Bat", "Mammal", 12, "Male");
		Lion l3 = new Lion("Mia", "Mammal", 12, "Female");
		CityZoo c = new CityZoo(12, 3, 2000, "Yo Yo ZOO");
		c.addAnimal(l1);;
		c.addAnimal(l2);
		c.addAnimal(l3);
		c.displayAnimals();
		c.addItem("Pizza");	
		c.addItem("Fries");
		c.displayMenu();
		}
		catch(InvalidZooException e){
			System.out.println(e);
		}
	}
}
