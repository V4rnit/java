import java.util.*;

public class WordSearch{
	public static boolean search(char [][] board, String word){
		int r = board.length;
		int c = board[0].length;
		
		for(int i = 0; i < r; i++)		{
			for(int j = 0; j < c; j++){
				if(dfs(board, word, i, j, 0)){
					return true;
				}
			}
		}
		return false;
	}
	public static  boolean dfs(char [][] board, String word, int row, int col, int idx ){
		if(idx == word.length()){
			return true;
		}
		if(row < 0 || col < 0 || row >= board.length || col >= board[0].length 
				|| board[row][col] != word.charAt(idx)){
			return false;
				}
		char temp = board[row][col];
		board[row][col] = '#';
		boolean found = dfs(board, word, row + 1, col, idx + 1)||
				dfs(board, word, row - 1, col, idx + 1 ) ||
				dfs(board, word, row, col + 1, idx + 1)  ||
				dfs(board, word, row, col -1, idx + 1);
		board [row][col] = temp;
		return found;
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
