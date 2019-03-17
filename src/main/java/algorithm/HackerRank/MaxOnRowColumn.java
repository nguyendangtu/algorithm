package algorithm.HackerRank;

public class MaxOnRowColumn {
    public static void main(String args[]) {
        int A[][] = new int[4][4];
        A[0][0] = 0;
        A[0][1] = 1;
        A[0][2] = 9;
        A[0][3] = 3;
        A[1][0] = 7;
        A[1][1] = 5;
        A[1][2] = 8;
        A[1][3] = 3;
        A[2][0] = 9;
        A[2][1] = 2;
        A[2][2] = 9;
        A[2][3] = 4;
        A[3][0] = 4;
        A[3][1] = 6;
        A[3][2] = 7;
        A[3][3] = 1;
        System.out.println(solution(A));

    }

    public static int solution(int[][] A) {
        int columns = A.length;
        int rows = A[0].length;

        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int leftIdx = i > 0 ? (i - 1) : i;
                int rightIdx = i < (rows - 1) ? (i + 1) : i;
                int upIdx = j > 0 ? (j - 1) : j;
                int downIdx = j < (columns - 1) ? (j + 1) : j;

                boolean maxRows = A[leftIdx][j] < A[i][j] && A[i][j] > A[rightIdx][j];
                boolean minRows = A[leftIdx][j] > A[i][j] && A[i][j] < A[rightIdx][j];

                boolean maxColumns = A[i][upIdx] < A[i][j] && A[i][j] > A[i][downIdx];
                boolean minColumns = A[i][upIdx] > A[i][j] && A[i][j] < A[i][downIdx];

                if ((maxColumns && minRows) || (maxRows && minColumns)) {
                    count++;
                }

            }
        }

        return count;
    }
}
