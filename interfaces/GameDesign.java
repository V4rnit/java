import java.util.*;
abstract class CharacterModel{
	private String name;
	private String type;
	private int elixirCost;
	//Getter and Setter
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public int getElixirCost(){
		return elixirCost;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setElixirCost(int elixirCost){
		if(elixirCost > 0 && elixirCost <= 10){
			this.elixirCost = elixirCost;
		}
	}
	//Constructor
	CharacterModel(String name, String type, int elixirCost){
		this.name = name;
		this.type = type;
		setElixirCost(elixirCost);
	}
	public void displayCharacter(){
		System.out.println("Name: " + name + " Type: " + type + " Elixir cost: " + elixirCost);
	}
}	
interface Iplayable{
	public void attack();
	public void heal();
}
class Character extends CharacterModel implements Iplayable{
	private int attack;
	private int heal;
	//Getter and Setter
	public int getAttack(){
		return attack;
	}
	public int getHeal(){
		return heal;
	}
	public void setAttack(int attack){
		if(attack > 0 && attack < 50){
			this.attack = attack;
		}
	}
	public void setHeal(int heal){
		if(heal > 0 && heal < 50){
			this.heal = heal;
		}
	}
	//Constructor
	Character(String name, String type, int elixirCost, int attack, int heal){
		super(name, type, elixirCost);
		setAttack(attack);
		setHeal(heal);
	}
	@Override 
	public void displayCharacter(){
		System.out.println("Name: " + getName() + " Type: " + getType() + " Elixir cost: " + getElixirCost());
	}
	@Override
	public void attack(){
		System.out.println("Your character attacks for: " + attack);
	}
	@Override
	public void heal(){
		System.out.println("Your Character heals for: " + heal);
	}
}
class Devloper{
	private String name;
	private int ID;
	private List<Character> characters;
	//Getter and Setter
	public String getName()	{
		return name;
	}
	public int getID(){
		return ID;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setID(int ID){
		this.ID = ID;
	}
	//Constructor
	Devloper(String name, int ID){
		this.name = name;
		this.ID = ID;
		this.characters = new ArrayList<>();
	}
	public void addCharacter(Character playerCharacter){
		characters.add(playerCharacter);
	}
	public void removeCharacter(Character playerCharacter){
		if(characters.size() != 0){
			characters.remove(playerCharacter);
		}
	}
	public void displayCharacters(){
		for(Character c : characters){
			c.displayCharacter();
		}
	}
}
public class GameDesign{
	public static void main(String [] args){
		Devloper d = new Devloper("Varnit", 192);
		Character c = new Character("Hog", "Overal", 4, 8, 2);
		d.addCharacter(c);
		d.displayCharacters();
	}
}
