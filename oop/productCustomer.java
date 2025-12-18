import java.util.*;

class Product{
	private String itemNo;
	private String name;
	private double price;
	private int qty;
	
	//Getters and Setters
	public String getItemNo(){
		return itemNo;
	}
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	public int getQty(){
		return qty;
	}
	public void setQty(int q){
		qty = q;
	}
	public void setPrice(double p){
		price = p;
	}
	//Constructors
	Product(String itemNo, String name, double p, int q){
		this.itemNo = itemNo;
		this.name = name;
		price = p;
		qty = q;
	}
	Product(String itemNo, String name, double p){
		this.itemNo = itemNo;
		this.name = name;
		price = p;	
	}
	public void displayProduct(){
		System.out.println("Item Number: " + getItemNo());
		System.out.println("Name of the product: " + getName());
		System.out.println("Price:  " + getPrice());
		System.out.println("Quantity: " + getQty());
	}
}
class Customer{
	String custId;
	String name;
	String address;
	String phNo;
	
	//Constructor
	Customer(String custId, String name, String address, String phNo){
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.phNo = phNo;
	}
	Customer(String custId, String name){
		this.custId = custId;
		this.name = name;
		this.address = "Not provided";
		this.phNo = "Not provided";
	}
	//getters 
	public String getId(){
		return custId;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhnumber(){
		return phNo;
	}
	//Setters
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhNo(String phNo){
		this.phNo = phNo;
	}
	public void displayCustomer(){
		System.out.println("id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Phone Number: " + getPhnumber());
	}
}
public class productCustomer{
	public static void main(String [] args){
		Product p1 = new Product("ABB-AA", "Maggi", 12, 2);
		Customer c1 = new Customer("123", "Varnt", "3004 st", "9549944");
		
		System.out.println("The details of the products is: ")	;
		p1.displayProduct();
		
		System.out.println("The details of the Customer is: ")	;
		c1.displayCustomer();
	}
}
