import java.util.*;

class leftRotate{
	public static int [] leftRotate(int [] arr){
		int [] res = new int [arr.length];
		for(int i = 1; i < arr.length; i++){
			res[i-1] = arr[i];
		}
		res[arr.length - 1] = arr[0];

		return res;
	}
	public static void main(String args[]){
		int [] array = {1,2,3,4,5,6,7,8,9,0};
		int [] res = leftRotate(array);
		
		for(int i = 0; i < res.length; i++ ){
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}
}


