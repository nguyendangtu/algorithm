package algorithm.HackerRank;

/***
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot
 * can take to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */
public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths(3, 2));
    }

    public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        int result = isUniquePath(0, 0, m - 1, n - 1, dp);
        if (m > 1 && n > 1) {
            result += 1;
        }
        return result;
    }

    public static int isUniquePath(int x, int y, int m, int n, int[][]dp) {
        if (dp[x][y] != 0) return dp[x][y];
        int result = 1;
        if (x < m - 1 && y == n - 1) {
            result += isUniquePath(x + 1, y, m, n, dp);
        }
        if (x == m - 1 && y < n - 1) {
            result += isUniquePath(x, y + 1, m, n, dp);
        }
        if (x < m - 1 && y < n - 1) {
            result += isUniquePath(x + 1, y, m, n, dp);
            result += isUniquePath(x, y + 1, m, n, dp);
        }
        dp[x][y] = result;
        return result;
    }

   /* public static int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return uniquePath(0, 0, m, n, dp);
    }

    public static int uniquePath(int x, int y, int m, int n, int[][] dp) {
        if (x == m - 1 && y == n - 1) return 1;
        if (x == m) return 0;
        if (y == n) return 0;
        if (dp[x][y] != 0) return dp[x][y];
        dp[x][y] = uniquePath(x + 1, y, m, n, dp) + uniquePath(x, y + 1, m, n, dp);
        return dp[x][y];

    }*/
}
