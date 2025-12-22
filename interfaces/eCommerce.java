import java.util.*;

abstract class User{
	private String name;
	private String email;

	//Getter and setter as the user is able to Change the name and email later on
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	//Constructor
	User(String name, String email){
		this.name = name;
		this.email = email;
	}
	public abstract void showDetails();
}
class Customer extends User{
	private double walletBalance;
	//Getter and setter
	public double getWalletBalance(){
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance){
		this.walletBalance = walletBalance;
	}
	//Constructor
	Customer(String name, String email, double walletBalance){
		super(name, email);
		this.walletBalance = walletBalance;
	}
	@Override
	public void showDetails(){
		System.out.println("Your name is: " + getName() + " Email: " + getEmail() + " Balance: " + walletBalance);
	}
	public void buyProduct(Product p){
		double discountPrice = p.applyDiscount(p.getPrice());
		if(walletBalance >= discountPrice){
			walletBalance -= discountPrice;
			System.out.println(getName() + " Bought: " + p.getName() + " for $" + discountPrice);
		}
		else{
			System.out.println(getName() + " Balance too low for: " + p.getName());
		}	
	}
	public void buyProduct(Product p, int qty){
		double total = p.applyDiscount(p.getPrice()) * qty;
		if(walletBalance >= total){
			walletBalance -= total;
			System.out.println(getName() + " Bought " + qty + ": " + p.getName() + " for $" + total);
		}
		else{
			System.out.println(getName() + " Balance too low for: " + p.getName());
		}	
	}
}
class Admin extends User{
	private String role;
	//Getter only since this is the adming and i cannot mess with the admin role
	public String getRole(){
		return role;
	}
	//Constructor of Admin
	Admin(String name, String email, String role){
		super(name, email);
		this.role = role;
	}
	@Override
	public void showDetails(){
		System.out.println("Your name is: " + getName() + " Email: " + getEmail() + " Role: " + role);
	}
}
interface Discountable{
	public double applyDiscount(double amount);
}
class Product implements Discountable{
	String name;
	double price;
	//Getters only
	public String getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	public double applyDiscount(double amount){
		return amount * 0.9;
	}
	public void showProduct(){
		System.out.println(name + "cost $: " + price);
	}
}

public class eCommerce {
    public static void main(String[] args) {

        // Create products
        Product laptop = new Product("Laptop", 1000);
        Product mouse = new Product("Mouse", 50);

        // Create users
        Customer customer = new Customer("Alice", "alice@gmail.com", 1200);
        Admin admin = new Admin("John", "john@admin.com", "Manager");

        // Show user details (polymorphism-ready)
        System.out.println("=== User Details ===");
        User[] users = { customer, admin };
        for (User u : users) {
            u.showDetails();   // runtime polymorphism
        }

        // Customer buys products
        System.out.println("\n=== Purchases ===");
        customer.buyProduct(laptop);        // single product
        customer.buyProduct(mouse, 2);      // overloaded method

        // Final customer balance
        System.out.println("\n=== Final State ===");
        customer.showDetails();
    }
}
