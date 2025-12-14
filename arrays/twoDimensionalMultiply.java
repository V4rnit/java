import java.util.*;

class twoDimensionalMultiply{
	//Assumption array a and b have the same row and column size
	public static int [][] matrixMultiplication(int[][] a, int[][] b, int r, int c){
		int res [][] = new int [r][c];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				res[i][j] = a[i][j] * b[i][j];
			}
		}
		return res;
	}
	public static void main(String args[]){
		int [][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		int [][] b = {{1,2,3}, {1,2,3}, {1,2,3}};

		int res[][] = matrixMultiplication(a, b, 3, 3);

		for(int r = 0; r < 3; r++){
			for(int c = 0; c < 3; c++){
				System.out.print(res[r][c] +" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
