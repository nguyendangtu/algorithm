package collectionFramework.Codility;

public class CutTreeBruteForce {
    public static void main(String args[]) {
        int[] arrays = {3, 4, 5, 4};
        System.out.println(cutTree(arrays));
        int[] arrays1 = {4, 5, 2, 3, 4};
        System.out.println(cutTree(arrays1));
        int[] arrays2 = {4, 4, 3, 2
        };
        System.out.println(cutTree(arrays2));
    }

    public static int cutTree(int[] arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            count += isSorted(removeElement(arrays, i));
        }
        return count;
    }

    public static int[] removeElement(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            result[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            result[i - 1] = array[i];
        }
        return result;
    }

    public static int isSorted(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] > arrays[i + 1]) {
                return 0;
            }
        }
        return 1;
    }
}
