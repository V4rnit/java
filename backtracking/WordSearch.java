import java.util.*;

public class WordSearch{
	public static boolean search(char [][] board, String word){
		int r = board.length;
		int c = board[0].length;
		boolean [][] visited = new boolean[r][c];
		for(int i = 0; i < r; i++)		{
			for(int j = 0; j < c; j++){
				if(dfs(board, word, i, j, 0, visited)){
					return true;
				}
			}
		}
		return false;
	}
	public static  boolean dfs(char [][] board, String word, int row, int col, int idx, boolean[][] visited ){
		if(idx == word.length()){
			return true;
		}
		if(row >= 0 && col >= 0 && row < board.length && col < board[0].length && board[row][col] == word.charAt(idx) && visited[row][col] == false){
			visited[row][col] = true;

			if(dfs(board, word, row + 1, col, idx + 1, visited)) return true;
			if(dfs(board, word, row, col + 1, idx + 1, visited)) return true;
			if(dfs(board, word, row - 1, col, idx + 1, visited)) return true;
			if(dfs(board, word, row, col - 1, idx + 1, visited)) return true;

			visited[row][col] = false;
		}
		return false;
	}
	public static void main(String [] args){
		char[][] board1 = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        	System.out.println(search(board1, "ABCCED")); // true
        	System.out.println(search(board1, "SEE"));    // true
        	System.out.println(search(board1, "ABCB"));   //false 
	}
}
