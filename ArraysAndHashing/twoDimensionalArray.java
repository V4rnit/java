import java.util.*;
class twoDimensionalArray{
	public static int [][] readData(int r, int c){
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int [r][c];
			
		for(int i = 0; i < r; i++){
			System.out.print("Enter the number of Integers in the current row: ");
			for(int j = 0; j < c; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	public static void maxVal(int [][] arr){
		int maxVal = arr[0][0];
		int maxR = 0;
		int maxC = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] > maxVal){
					maxVal = arr[i][j];
					maxR = i + 1;
					maxC = j + 1;
				}
			}
		}
		System.out.println("The max value in this 2d array is: " + maxVal);
		System.out.println("The Value was found at row: " + maxR + " The columns was " + maxC);

	}
	public static void main(String args[]){
		int [][] arr = readData(3,4);
		maxVal(arr);
	}
}
