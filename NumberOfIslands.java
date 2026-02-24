class Solution{
	public int numIslands(char [][] grid){
		if(grid.length == 0 || grid == null){
			return 0;
		}
		int count = 0;

		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == '1'){
					count++;
					dfs(grid, i, j);
				}
			}
		}
		return count;
	}

	public void dfs(char [][] grid, int row, int col){

		int rowLen = grid.length;
		int colLen = grid[0].length;
		if(row >= 0 && col >= 0 && row < rowLen && col < colLen && grid[row][col] == '1'){
			grid[row][col] = '0';
			dfs(grid, row + 1, col);
			dfs(grid, row, col + 1);
			dfs(grid, row - 1, col);
			dfs(grid, row, col - 1);
		}
	}

}
// Test class
public class NumberOfIslands{
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        char[][] grid1 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        System.out.println("Number of Islands (Test Case 1): " + solution.numIslands(grid1));
        // Expected output: 3

        // Test Case 2 - All water
        char[][] grid2 = {
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'}
        };
        System.out.println("Number of Islands (Test Case 2): " + solution.numIslands(grid2));
        // Expected output: 0

        // Test Case 3 - Single island
        char[][] grid3 = {
            {'1','1','1'},
            {'1','1','1'},
            {'1','1','1'}
        };
        System.out.println("Number of Islands (Test Case 3): " + solution.numIslands(grid3));
        // Expected output: 1
    }
}
