import java.util.*;

class Rectangle{
	double length;
	double breadth;

	public double area(){
		return length * breadth;
	}
}
public class rectangle{
	public static void main(String [] args){
		Rectangle r1 = new Rectangle();
		r1.length = 4.3;
		r1.breadth = 2.2;

		System.out.println("The area of the recatangle is: " + r1.area());
	}
}
