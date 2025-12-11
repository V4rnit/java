import java.util.*;

class reverseArray{
	public static int [] reverseBrute(int [] arr){
		int n = arr.length;
		int [] res = new int[n];
		
		int j = 0;

		for(int i = n - 1; i >= 0; i--){
			res[j] = arr[i];
			j++;
		}
		return res;
	}
	public static void reverseOptimal(int [] arr){
		int i = 0;
		int j = arr.length - 1;

		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void reverseRecursive(int [] arr, int left, int right){
		if(left >= right){
			return;
		}
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		reverseRecursive(arr, left + 1, right - 1);
	}
	public static void main(String args[]){
		//Reversing an array using the Brute force approach using an helper array
		int [] arrBrute = {1,2,3,4,5};

		int [] newArray = reverseBrute(arrBrute);
		for(int i = 0; i < newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
		System.out.println();
		//Reversing an array using the Two Tracker technique
		int [] arrOptimal = {9,8,7,6,5,4};
		reverseOptimal(arrOptimal);

		for(int i = 0; i < arrOptimal.length; i++){
			System.out.print(arrOptimal[i] + " ");
		}
		System.out.println();
		
		//Recursively reversing array;
		int [] arrRecursive = {6,7,8,9};
		reverseRecursive(arrRecursive,0, arrRecursive.length -1);
		
		for(int i = 0; i < arrRecursive.length; i++){
			System.out.print(arrRecursive[i] + " ");
		}
		System.out.println();
	}
}
