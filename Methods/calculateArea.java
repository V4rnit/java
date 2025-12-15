import java.util.*;
public class calculateArea{
	public static double area(double l, double b){
		return (l * b);
	}
	public static double area(double radius){
		return Math.PI * (radius * radius);
	}
	public static void main(String args[]){
		System.out.println("The are of the rectangle is: " + area(10, 20));
		System.out.println("The are of the circle is: "+ area(4.5));
	}
}
