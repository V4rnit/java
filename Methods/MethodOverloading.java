import java.util.*;
public class MethodOverloading{
	public static int getMax(int a, int b){
		return (a > b) ? a : b;
	}
	public static int getMax(int a, int b, int c){
		return(a > b && a > c) ? a : (b > c) ? b : c;
	}
	public static void main(String args[]){
		System.out.println(getMax(1,2));

		System.out.println(getMax(1,2,3));
	}
}
