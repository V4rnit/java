/* 
   COP3503 Computer Science 2
   N-Queens Solver
   NQueen.java
*/

import java.util.*;

public class NQueenSolver
{
    // Number of Queens & also the size of the board
    private int n;
    // 2D array to represent the board
    private int board[][];
    // Arrays to track used rows and diagonals (both ascending // and descending \\)
    private boolean[] usedRows;
    private boolean[] usedDescendingDiagonals;
    private boolean[] usedAscendingDiagonals;

    // Constructor to initialize the board and helper arrays
    public NQueenSolver(int n)
    {
        this.n = n;
        this.usedRows = new boolean[n];
        this.usedDescendingDiagonals = new boolean[2 * n];
        this.usedAscendingDiagonals = new boolean[2 * n];
        this.board = new int[n][n];
    }

    // Method to solve the N-Queen problem
    public boolean solve()
    {
        return solveRecursively(0);
        
    }

    // Recursive method to place queens column by column
    private boolean solveRecursively(int column)
    {
        for(int row = 0; row < n; row++)
        {
            if(isPositionSafe(row, column)){
                // Place the queen
                board[row][column] = 1;
                usedRows[row] = true;
                usedDescendingDiagonals[n - column + row] = true;
                usedAscendingDiagonals[column + row] = true;

                if(column == n - 1)
                    return true;
                else
                {
                    if(solveRecursively(column + 1))
                        return true;
                    else
                    {
                        usedRows[row] = false;
                        usedDescendingDiagonals[n - column + row] = false;
                        usedAscendingDiagonals[column + row] = false;
                        board[row][column] = 0;
                    

                    }
                }
            }

        }
        return false;
    }

    // Method to check if placing a queen is safe
    private boolean isPositionSafe(int row, int column)
    {
        boolean inRawUsed = usedRows[row];
        boolean inDescendingDiagonalUsed = usedDescendingDiagonals[n - column + row];
        boolean isAscendingDiagonalUsed = usedAscendingDiagonals[column + row];

        return !(inRawUsed || inDescendingDiagonalUsed || isAscendingDiagonalUsed);

        
    }

    // Method to generate a string representation of the board
    @Override
    public String toString()
    {
        StringBuilder boardRepresentation = new StringBuilder("Board Size: ");
        boardRepresentation.append(n).append(" x ").append(n).append("\n");
        boardRepresentation.append("Board Configuration:\n");
        for (int row = 0; row < n; ++row)
        {
            for (int column = 0; column < n; ++column)
                boardRepresentation.append(board[row][column]).append(" ");
            boardRepresentation.append("\n");
        }
        return boardRepresentation.toString();
    }

    // Main method to test the solver
    public static void main(String[] args)
    {
        // Variable to set dimension of the board; the number of Queens will be the same as well
        int boardSize;
        // Solve for a 4x4 board
        boardSize = 4;
        NQueenSolver solver1 = new NQueenSolver(boardSize);
        solver1.solve();
        System.out.println(solver1);

        // Solve for a 12x12 board
        boardSize = 12;
        NQueenSolver solver2 = new NQueenSolver(boardSize);
        solver2.solve();
        System.out.println(solver2);

        // Solve for a 30x30 board
        boardSize = 30;
        NQueenSolver solver3 = new NQueenSolver(boardSize);
        solver3.solve();
        System.out.println(solver3);
    }
}
