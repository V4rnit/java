import java.util.*;

class addElementSorted{
	public static void addElement(int [] arr, int n, int capacity, int value){
		if(capacity == n){
			return;
		}	
		int i;
		for(i = n - 1; i >= 0 && arr[i] > value; i--){
			arr[i+1] = arr[i];
		}
		arr[i + 1] = value;
	}
	public static void main(String args[]){
		int [] list = new int [5];
		list[0] = 1;
		list[1] = 2;
		list[2] = 4;
		
		addElement(list, 3, 5, 3);

		for(int i = 0; i < list.length; i++){
			System.out.println(list[i] + " ");
		}
		System.out.println();
	}
}
