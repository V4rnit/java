import java.util.*;
class TV{
	public void switchOn(){
		System.out.println("Hello the TV is on");
	}
	public void changeChannel(){
		System.out.println("You just changed the channel of this TV");
	}
}
class SmartTV extends TV{
	@Override
	public void switchOn(){
		System.out.println("Hello the SmartTV is on");
	}
	@Override
	public void changeChannel(){
		System.out.println("You changed the channel of the Smart TV");
	}
	public void browse(){
		System.out.println("You are browsing the Smart TV");
	}
}
public class tvMethodOverriding{
	public static void main(String [] args){
		//Create a reference to the TV object
		TV t = new TV();
		t.switchOn();
		t.changeChannel();
		
		//Create a reference to the Smart TV object
		SmartTV st = new SmartTV();
		st.switchOn();
		st.changeChannel();
		st.browse();

		//Now i am going to create a referece of type TV but the object is of Smart TV
		TV t1 = new SmartTV();
		t1.switchOn();
		t1.changeChannel();
		//This should use the methods of the Smart TV object as the object itself is a smart TV
		//and since this is a pointer of type TV i cannot invoke a method that is not bein overwritten
	}
}
