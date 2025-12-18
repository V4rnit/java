import java.util.*;

class Circle{
	private double radius;
	//Constructor
	Circle(double radius){
		setRadius(radius);
	}
	//Getter and Setter
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		if(radius <= 0) 
			this.radius = 1;
		else{
			this.radius = radius;
		}
	}
	public double getArea(){
		return Math.PI * (radius * radius);
	}
}
class Cylinder extends Circle{
	private double height;
	//Constructor
	Cylinder(double radius, double height){
		super(radius);
		setHeight(height);
	}
	//Getters and setters
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		if(height <= 0){
			this.height = 1;
		}
		else{
			this.height = height;
		}
	}
	public double getArea(){
    		return 2 * Math.PI * getRadius() * getHeight()
         	+ 2 * super.getArea();
	}
} 
public class CylinderExtendsCircle{
	public static void main(String [] args){
		Circle c1 = new Circle(2.2);
		Cylinder c2 = new Cylinder(2.2, 5.4);
		
		System.out.println("The radius of the circle is: " +c1.getRadius());
		System.out.println("The radius and the height of the cylinder is: " 
				   + c2.getRadius() + " " + c2.getHeight());
		
		System.out.println("The area of the Circle is: " + c1.getArea());
		System.out.println("The area of the Cylinder is: " + c2.getArea());
	}
}
