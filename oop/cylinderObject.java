import java.util.*;
class Cylinder{
	private double radius;
	private double height;

	//getters are setters for this class
	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius = r;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double h){
		height = h;
	}
	//Setter to set the dimension of the given cyclinder
	public void setDimension(double r,double h){
		radius = r;
		height = h;
	}
	//Constructors 3 Types
	Cylinder(){
		radius = 1;
		height = 1;
	}
	Cylinder(double r){
		radius = r;
		height = 1;
	}
	Cylinder(double r, double h){
		setDimension(r, h);
	}
	public double CylinderArea(){
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;	
	}
}
public class cylinderObject{
	public static void main(String [] args){
		Cylinder c = new Cylinder(10,5);
		System.out.println("The are of the cylinder is: " + c.CylinderArea());
	}
}
