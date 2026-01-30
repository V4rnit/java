public class MazeSolver {
    static final int N = 4; // Size of the maze

    // Function to print the path matrix
    static void printPath(int[][] path) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Backtracking function to solve the maze
    static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] path) {
	    //Base case i have found a valid path from a given row and cell
	    if(x == N - 1 && y == N - 1){
		printPath(path);
		return true;
	    }
	    if(x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1 && path[x][y] == 0){
		path[x][y] = 1;
		if(solveMazeUtil(maze, x + 1, y, path)) return true; //Going down
		if(solveMazeUtil(maze, x, y + 1, path)) return true; // Going right
		if(solveMazeUtil(maze, x - 1, y , path)) return true; // Going up
		if(solveMazeUtil(maze, x, y - 1, path )) return true; //Going left

		path[x][y] = 0;
	    }
	    return false;
    }

    // Wrapper function to start solving the maze
    static void solveMaze(int[][] maze) {
        int[][] path = new int[N][N]; // Initialize path matrix

        if (!solveMazeUtil(maze, 0, 0, path)) {
            System.out.println("No solution found.");
        }
    }

    // Main function
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 1, 0},
            {0, 1, 0, 1},
            {1, 1, 1, 1}
        };

        solveMaze(maze);
    }
}
