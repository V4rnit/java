import java.util.*;
class OuterClass{
	int x = 10;
	class Inner{
		int y = 20;
		public void innerDisplay(){
			System.out.println(x + " " + y);
		}
	}
	public void outerDisplay(){
		//First i would need to create an Object of the inner class only then i can use the y variable
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}
}
public class ExampleOne{
	public static void main (String [] args){
		OuterClass o = new OuterClass();
		o.outerDisplay();
		//Now to create an object of the inner class 
		OuterClass.Inner in = o.new Inner();
		in.innerDisplay();
	}
}
