package algorithm.companies.test;

/**
 * @author : JOHNNGUYEN
 * @since : 11/18/2023, Sat
 **/
public class WordBoard {
    public static void main(String[] args) {
        char board [][] = new char[4][3];
        board[0][0] = 's';
    }

    private static int solution(char[][] board, String word) {
        int count = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (dfs(board, row, col, word, 0)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean dfs(char[][] board, int row, int col, String word, int index) {
        int m = board.length;
        int n = board[0].length;
        if (index == word.length()) return true;
        if (row >= m || col >= n || board[row][col] != word.charAt(index)) return false;
        return dfs(board, row + 1, col, word, index + 1)
                || dfs(board, row, col + 1, word, index + 1)
                || dfs(board, row + 1, col + 1, word, index + 1);
    }
}
