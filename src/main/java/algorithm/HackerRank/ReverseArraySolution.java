package algorithm.HackerRank;

public class ReverseArraySolution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("abs array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        System.out.println("array after rotate");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
