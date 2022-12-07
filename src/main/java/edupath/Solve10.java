package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 24/04/2022 - 3:12 PM
 */
public class Solve10 {
    public static void main(String args[]) {
        int[] a = solve10();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] solve10() {
        int solve10[] = new int[2];
        int tenFactorial = 1;
        int x = 0;
        int y = 0;
        boolean factorialFound = false;
        for (int i = 1; i <= 10; i++) {
            tenFactorial = tenFactorial * i;
        }
        for (x = 0; x < 10; x++) {
            int xFactorial = 1;
            if (x > 0) {
                for (int i = 1; i <= x; i++) {
                    xFactorial = xFactorial * i;
                }
            }
            for (y = 0; y < 10; y++) {
                int yFactorial = 1;
                if (y > 0) {
                    for (int j = 1; j <= y; j++) {
                        yFactorial = yFactorial * j;
                    }
                }
                if (xFactorial + yFactorial == tenFactorial) {
                    factorialFound = true;
                    break;
                }
            }
            if (factorialFound) {
                break;
            }
        }
        if (x == 10 && y == 10) {
            //Not Found
            x = 0;
            y = 0;
        }
        solve10[0] = x;
        solve10[1] = y;
        return solve10;
    }

    public static int[] xsolve10(int n) {
        int[] result = new int[2];
        int factorial10 = nFactorial(10);
        for (int i = 10; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nFactorial(i) + nFactorial(j) == factorial10) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    public static int nFactorial(int n) {
        if (n == 0) return 1;
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

}
