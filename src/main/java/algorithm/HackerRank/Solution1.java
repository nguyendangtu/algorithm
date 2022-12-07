package algorithm.HackerRank;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 22/08/2021 - 3:29 PM
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 6};
        arrayAddition(arr);

    }

    public static boolean arrayAddition(int[] arr) {
        int index = findIndexMax(arr);
        int max = arr[index];
        int set[] = removeMax(arr, index);
        boolean result = isSubsetSum(set, set.length, max);
        System.out.println(result);
        return result;
    }

    static boolean isSubsetSum(int set[], int n, int max) {
        if (max == 0) return true;
        if (n == 0) return false;
        if (set[n - 1] > max) {
            return isSubsetSum(set, n - 1, max);
        }
        return isSubsetSum(set, n - 1, max)
                || isSubsetSum(set, n - 1, max - set[n - 1]);
    }

    public static int findIndexMax(int array[]) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] removeMax(int array[], int index) {
        int[] copy = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                copy[j++] = array[i];
            }
        }
        return copy;
    }


}
