import java.util.*;
class Solution{
	public void insertionSorted(int [] arr,int val, int c){
		if(c == arr.length){
			return;
		}
		int i = c - 1;
		while(i >= 0 && arr[i] > val){
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = val;
		
		}
}

public class AddSorted{
	public static void main(String [] args){
		int [] arr = new int [10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;

		Solution sol = new Solution();
		sol.insertionSorted(arr, 3, 3);
		for(int n : arr){
			System.out.println(n);
		}
	}
}
