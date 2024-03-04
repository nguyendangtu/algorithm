package algorithm.companies.test;

/**
 * @author : JOHNNGUYEN
 * @since : 12/14/2023, Thu
 **/
public class Test4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] result = rotateArray(array, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] rotateArray(int[] array, int k) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[(i + k) % array.length];
        }
        return result;
    }
}
