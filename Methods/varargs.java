import java.util.*;

public class varargs{
	public static double findDiscount(double ...p){
		double sum = 0;
		for(int i = 0; i < p.length; i++){
			sum += p[i];
		}	
		return (sum < 200) ? sum * 0.10 : sum * 0.20;
	}
	public static int getMax( int ...a){
		int currMax = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i] > currMax) currMax = a[i];
		}
		return currMax;
	}
	public static int sumAll(int ...b){
		int sum = 0;
		for(int x : b){
			sum += x;
		}
		return sum;
	}
	public static void main(String [] args){
		System.out.println("The max of all the numbers is: " + getMax(60,89,299,90,919,100));
		System.out.println("The sum of all the elements is: " + sumAll(23,332,83,283));
		System.out.println("Your Discount is: " + findDiscount(10.00, 20.00, 50.00));
	}
}
