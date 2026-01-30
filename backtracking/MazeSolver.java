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
	    //Base case: if i reach the end of my maze print the path i took and
	    //call the print path function so i can output the valid path i took
	    if(x == N - 1 && y == N - 1){
		    printPath(path);
		    return true;
	    }
	    //Now i want to check that the row & cell i am currently at is a valid one or not 
	   // And also check that this path has not been already explored
	    if(x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1 && path[x][y] == 0){
		    path[x][y] = 1;
		    if(solveMazeUtil(maze, x + 1, y, path)) return true; //going down
		    if(solveMazeUtil(maze, x, y + 1, path)) return true; //going right
		    if(solveMazeUtil(maze, x - 1, y, path)) return true; //going up
		    if(solveMazeUtil(maze, x, y - 1, path)) return true; //going left
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
