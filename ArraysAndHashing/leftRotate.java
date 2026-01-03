import java.util.*;

class leftRotate{
	public static int [] leftRotateBrute(int [] arr){
		int [] res = new int [arr.length];
		
		for(int i = 1; i < arr.length; i++){
			res[i-1] = arr[i];
		}
		res[arr.length - 1] = arr[0];

		return res;
	}

	public static void  leftRotateOptimal(int[] arr){
		int t = arr[0];
		for(int i = 1; i < arr.length; i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length - 1] = t;

	}
	public static void main(String args[]){
		//Using Brute Force approach here
		int [] bruteArray = {1,2,3,4,5,6,7,8,9,0};

		int [] resBrute = leftRotateBrute(bruteArray);

		for(int i = 0; i < resBrute.length; i++){
			System.out.print(resBrute[i] +" ");
		}
		System.out.println();

		//Using Optimal Approach here
		int [] optimalArray = {3,4,5,6,7,8,9,0};
		leftRotateOptimal(optimalArray);

		for(int i = 0; i < optimalArray.length; i++){
			System.out.print(optimalArray[i] + " ");
		}
		System.out.println();
		
	}
}

