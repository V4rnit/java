import java.util.*;
abstract class My{
	public abstract void display();
}
class Outer{
	public void meth1(){
		My m = new My(){
			@Override
			public void display(){
				System.out.println("Hello Guys");
			}
		};
		m.display();
	}
}
public class AnonymousInnerClass{
	public static void main(String [] args){
		Outer o = new Outer();
		o.meth1();
	}
}
