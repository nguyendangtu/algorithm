package algorithm.HackerRank;

/**
 * @author : JOHNNGUYEN
 * @since : 7/25/2023, Tue
 **/
public class SudokuSolver {

    private static final int BOARD_SIZE = 9;
    private static final int EMPTY_CELL = 0;

    public boolean solveSudoku(int[][] board) {
        return backTracking(board, 0, 0);
    }

    private boolean backTracking(int[][] board, int row, int col) {
        if (row == BOARD_SIZE) {
            return true;
        }

        if (col == BOARD_SIZE) {
            return backTracking(board, row + 1, 0);
        }

        if (board[row][col] != EMPTY_CELL) {
            return backTracking(board, row, col + 1);
        }

        for (int num = 1; num <= 9; num++) {
            if (isValidaSudoku(board, row, col, num)) {
                board[row][col] = num;
                if (backTracking(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = EMPTY_CELL;
            }
        }

        return false;
    }

    private boolean isValidaSudoku(int[][] board, int row, int col, int num) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int boxStartRow = row - row % 3;
        int boxStartCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxStartRow + i][boxStartCol + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] sudokuBoard = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        SudokuSolver solver = new SudokuSolver();
        if (solver.solveSudoku(sudokuBoard)) {
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    System.out.print(sudokuBoard[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists for the given Sudoku.");
        }
    }
}
