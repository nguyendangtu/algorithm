package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 3:13 PM
 */
public class isVesuvian {

    public static void main(String args[]) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(689));
        System.out.println(isVesuvian(51));
    }

    public static int isVesuvian(int n) {
        if (n < 2) return 0;
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            for (int j = 1; j * j < n; j++) {
                if (i * i + j * j == n) {
                    count++;
                    if (count == 2) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
