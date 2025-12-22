import java.util.*;
interface Imember{
	public void callBack();
}
class Store{
	private int count;
	Imember [] m = new Imember[100];
	public void register(Imember mm){
		m[count++] = mm;
	}
	public void inviteSale(){
		for(int i = 0; i < count; i++){
			m[i].callBack();
		}
	}
}
//This customer class can implement a Imemeber interface
class Customer implements Imember{
	public String name;
	//Constructor
	Customer(String name){
		this.name = name;
	}
	@Override
	public void callBack(){
		System.out.println("Yes i will visit" + name);
	}
}
public class StudentChallenge{
	public static void main(String [] args){
		Store s = new Store();
		Customer c1 = new Customer("Varnit");
		Customer c2 = new Customer("Alice");
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}
}
