import java.util.*;

public class arithmeticException{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		try{
			System.out.println("Eneter the value of a: ");
			a = sc.nextInt();
			System.out.println("Enter the value of b: ");
			b = sc.nextInt();
			c = a/b;
			System.out.println("Resutl is: " + c);
		}
		catch(ArithmeticException e){
			System.out.println("Division by 0 not allowed" + e);
		}
		sc.close();
	}
}
