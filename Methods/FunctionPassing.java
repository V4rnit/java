import java.util.*;

public class FunctionPassing{
	//This function take and array, an index and a value and changes that current index to the value in function parameter
	//Void type since arrays are always passed by reference
	public static void changeArray(int [] arr, int value, int index){
		if(index > arr.length - 1){
			return;
		}
		arr[index] = value;
	}
	public static int changePrimitive(int x, int val){
		x = val;
		return x;
	}
	public static void main(String args[]){
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		int a = 20;
		changeArray(nums, 99, 2);
		
		a = changePrimitive(a, 10000);

		for(int x:nums){
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("The value of the primitive data is: " + a);
	}
}
