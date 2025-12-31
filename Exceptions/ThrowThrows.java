import java.util.*;
class NegativeDimensionException extends Exception{
	@Override
	public String toString(){
		return "Dimensions cannot be negative";
	}
}
public class ThrowThrows{
	public static int rectangleArea(int l, int b) throws NegativeDimensionException{
		if(l < 0 || b < 0){
			throw new NegativeDimensionException();
		}
		return l * b;
	}
	public static void wrapper() throws NegativeDimensionException{
		int a = rectangleArea(-10, 5);
		System.out.println("Area: " + a);
	}
	public static void main(String [] args ){
		try{
			wrapper();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
}
