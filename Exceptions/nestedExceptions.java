import java.util.*;
public class nestedExceptions{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int [] nums = new int [n];
	
		System.out.println("Enter the values in the array: ");
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter the indices you want to divide");
		int idx1, idx2;
		idx1 = sc.nextInt();
		idx2 = sc.nextInt();
		
		try{
			System.out.println("The division is: " + nums[idx1] / nums[idx2]);
			try{
				System.out.println("Enter the index you want to retrieve");
				int r = sc.nextInt();
				System.out.println(nums[r]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Program Ended");
		sc.close();
	}
}
