package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 19/04/2022 - 9:44 PM
 */
public class NextPerfectSquare {

    public static void main(String args[]) {
        System.out.println(nextPerfectSquare(6));
        System.out.println(nextPerfectSquare(36));
        System.out.println(nextPerfectSquare(0));
        System.out.println(nextPerfectSquare(-5));
    }

    public static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 0;
        if (n >= 0) {
            double square = Math.sqrt(n);
            int next = (int) Math.abs(square) + 1;
            nextPerfectSquare = next * next;
        }
        return nextPerfectSquare;
    }
}
