class Solution{
	public int maxAreaOfIsland(int [][] grid){
		if(grid.length == 0 || grid == null){
			return 0;
		}
		int maxArea = 0;

		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				maxArea = Math.max(maxArea, dfs(grid, i, j));
			}
		}
		return maxArea;
	}
	public int dfs(int [][] grid, int row, int col){
		int res = 0;
		int rowLen = grid.length;
		int colLen = grid[0].length;
		
		if(row >= 0 && col >= 0 && row < rowLen && col < colLen && grid[row][col] == 1){
			res = 1;
			grid[row][col] = 0;
			
			res += dfs(grid, row + 1, col);
			res += dfs(grid, row, col + 1);
			res += dfs(grid, row - 1, col);
			res += dfs(grid, row, col - 1);
		}
		return res;
	}
}
public class MaxAreaIslands{
	public static void main(String [] args){
		int[][] grid1 = {
    					{0, 1, 0, 0},
    					{1, 1, 0, 0},
    					{0, 1, 0, 0},
    					{0, 0, 0, 0}
				};
		int[][] grid2 = {
 					{1, 0, 0, 1},
    					{0, 1, 0, 0},
    					{0, 0, 1, 1},
    					{1, 0, 1, 0}
				};
		int[][] grid3 = {
    					{0, 0, 0},
    					{0, 0, 0},
    					{0, 0, 0}
					
				};

		Solution sol = new Solution();

		System.out.println(sol.maxAreaOfIsland(grid1)); //Expected 4
		System.out.println(sol.maxAreaOfIsland(grid2)); //Expected 2
		System.out.println(sol.maxAreaOfIsland(grid3)); //Expected 0

	}
}
