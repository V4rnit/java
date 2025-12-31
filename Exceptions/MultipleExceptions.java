import java.util.*;
public class MultipleExceptions{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//Asking the user for the size of the array and inputing values
		
		System.out.println("Enter the Size of the array: ");
		int n = sc.nextInt();
		int [] array = new int[n];
		
		System.out.println("Please enter the values in the array: ");
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		System.out.println("The values are: ");
		for(int nums : array){
			System.out.print(nums+ ",");
		}
		//Start of my Try block
		System.out.println();
		try{
			System.out.println("Enter the index, You want to divide");
			int idx1 = sc.nextInt();
			int idx2 = sc.nextInt();
			int res = array[idx1] / array[idx2];
			System.out.println(res);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		sc.close();
	}
}
