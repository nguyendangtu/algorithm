package algorithm.HackerRank;

import java.util.HashMap;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board =
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            char[] rowDigits = new char[9];
            char[] columnDigits = new char[9];
            for (int j = 0; i < 9; j++) {
                if (board[i][j] != '.') {
                    if (isExist(rowDigits, board[i][j])) {
                        return false;
                    } else {
                        rowDigits[j] = board[i][j];
                    }

                    if (isExist(columnDigits, board[j][i])) {
                        return false;
                    } else {
                        columnDigits[j] = board[j][i];
                    }
                }
            }
        }
        return true;
    }

    public static boolean isExist(char digits[], char c) {
        for (int i = 0; i < digits.length; i++) {
            if (c == digits[i]) {
                return true;
            }
        }
        return false;
    }
}
