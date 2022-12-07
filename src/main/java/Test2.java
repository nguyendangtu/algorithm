/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 03/05/2022 - 5:13 AM
 */
public class Test2 {

    public static void main(String args[]) {
        System.out.println(is121Array(new int[]{1,2,1,2,1}));
        System.out.println(is121Array(new int[]{1,2,1,1}));
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    public static int is121Array(int[] a) {
        if (a == null || a.length < 3) return 0;
        if (a[0] != 1 || a[a.length - 1] != 1) return 0;
        if (a[a.length / 2] != 2) return 0;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == 1) {
                if (a[a.length - i - 1] != 1) {
                    return 0;
                }
            } else if (a[i] != 2 || a[a.length - 1 - i] != 2) {
                return 0;
            }
        }
        return 1;
    }


}
