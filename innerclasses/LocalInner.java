import java.util.*;
class Outer{
	public void display(){
		class Inner{
			public void innerDisplay(){
				System.out.println("Inner Hello");
			}
		}
		Inner i = new Inner();
		i.innerDisplay();
	}
}
public class LocalInner{
	public static void main(String [] args){
		Outer o = new Outer();
		o.display();
	}
}
