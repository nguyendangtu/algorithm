package collectionFramework.Codility;

public class CutTree {
    public static void main(String args[]) {
        int[] arrays = {3, 4, 5, 4};
        System.out.println(solution(arrays));
        int[] arrays11 = {3, 4, 5, 4, 5};
        System.out.println(solution(arrays11));
        int[] arrays12 = {3, 5, 5, 4, 5, 5};
        System.out.println(solution(arrays12));
        int[] arrays1 = {10, 4, 5, 6, 7, 8, 9};
        System.out.println(solution(arrays1));
        int[] arrays13 = {4, 5, 6, 7, 8, 9};
        System.out.println(solution(arrays13));
        int[] arrays14 = {5, 4, 2, 3, 4};
        System.out.println(solution(arrays14));

    }

    public static int solution(int[] a) {
        if (a.length == 0 || a.length == 1) return 0;
        int cutTreeCount = 0;
        boolean isSorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                continue;
            }

            if (!isSorted) {
                return 0;
            }

            isSorted = false;
            if (i == 0) {
                cutTreeCount++;
                continue;
            } else if (a[i - 1] <= a[i + 1]) {
                cutTreeCount++;
            }

            if (i + 1 < a.length - 1) {
                if (a[i + 1] > a[i + 2]) {
                    return 0;
                } else {
                    if (a[i] <= a[i + 2]) {
                        cutTreeCount++;
                        continue;
                    }
                }
            } else {
                cutTreeCount++;
            }
        }

        if (isSorted) {
            return a.length;
        }

        return cutTreeCount;
    }
}
