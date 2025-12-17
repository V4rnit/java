import java.util.*;

class Circle{
	double radius;

	public double area(){
		return Math.PI * (radius*radius);
	}
	public double circumfrence(){
		return 2 * Math.PI * radius;
	}
}
public class circleObject{
	public static void main(String [] args)	{
		Circle c1 = new Circle();
		
		c1.radius = 7;
		System.out.println("The area of this circle is: " + c1.area());
		System.out.println("The circumfrence of this circle is: " + c1.circumfrence());
	}
}
