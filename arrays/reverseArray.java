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
	public static void main(String args[]){
		int [] arrBrute = {1,2,3,4,5};

		int [] newArray = reverseBrute(arrBrute);
		for(int i = 0; i < newArray.length; i++){
			System.out.print(newArray[i] + " ");
		}
		System.out.println();

		int [] arrOptimal = {9,8,7,6,5,4};
		reverseOptimal(arrOptimal);

		for(int i = 0; i < arrOptimal.length; i++){
			System.out.print(arrOptimal[i] + " ");
		}
		System.out.println();
	}
}
