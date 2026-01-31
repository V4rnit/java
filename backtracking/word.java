class Solution{
	public boolean exist(char [][] board, String word){
		int r = board.length;
		int c = board[0].length;
		boolean [][] visited = new boolean[r][c];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				boolean check = search(board, word, 0, i, j, visited);
				if(check == true){
					return true;
				}
			}
		}
		return false;
	}
	public boolean search(char[][]board, String word, int idx, int row, int col, boolean[][] visited){
		if(idx == word.length()){
			return true;
		}
		int n = board.length;
		int m = board[0].length;
		if(row >= 0 && col >= 0 && row < n && col < m && board[row][col] == word.charAt(idx) && visited[row][col] == false ){
			visited[row][col] = true;

			if(search(board, word, idx + 1, row + 1, col, visited)) return true; //going down
			if(search(board, word, idx + 1, row , col + 1, visited)) return true; //going right
			if(search(board, word, idx + 1, row - 1, col, visited)) return true; //going up
			if(search(board, word, idx + 1, row , col - 1, visited)) return true; //going left
			
			visited[row][col] = false;
		}
		return false;
	}
}
public class word{
	public static void main(String [] args){

	}
}
