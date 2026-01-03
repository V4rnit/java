import java.util.*;

class deleteElement{
	public static int delete(int[] arr, int n, int value){
		int pos = -1;
		for(int i = 0; i < n; i++){
			if(arr[i] == value ){
				pos = i;
				break;
			}
		}
		if(pos == -1) return n;

		for(int i = pos; i < n-1; i ++){
			arr[i] = arr[i+1];
		}
		return n -1;
	}
	public static void main(String args[]){
		int [] array = new int [5];
		array[0] = 2;
		array[1] = 1;
		array[2] = 5;
		array[3] = 4;
		array[4] = 8;
		int n = 5;
		n = delete(array, n, 5);
		for(int i = 0; i < n; i++){
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}
}
