import java.util.*;
abstract class Shape{
	public abstract double perimeter();
	public abstract double area();
}
class Circle extends Shape{
	//Getter Only
	public double getRadius(){
		return radius;
	}

	private double radius;
	//Constructor
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
	@Override
	public double area(){
		return Math.PI * (radius * radius);
	}
}
class Rectangle extends Shape{
	private double length;
	private double breadth;
	//Getters only
	public double getLength(){
		return length;
	}
	public double getBreadth(){
		return breadth;
	}
	@Override
	public double perimeter(){
		return 2 * (length + breadth);
	}
	@Override
	public double area(){
		return length * breadth;
	}
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
}
public class shapeChallenge{
	public static void main(String [] args){
		Shape s1 = new Circle(3.2);
		Shape s2 = new Rectangle(1.2, 3.4);
		
		//Circle
		System.out.println("The perimeter of the circle is: " + s1.perimeter());
		System.out.println("The area of the circle is: " + s1.area());

		//Rectangle
		System.out.println("The perimeter of the Rectangle is: " + s2.perimeter());
		System.out.println("The area of the Rectangle is: " + s2.area());

	}
}
