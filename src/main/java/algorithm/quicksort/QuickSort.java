package algorithm.quicksort;

import java.util.Arrays;
import java.util.stream.Collectors;

public class QuickSort {


    public static final int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi);
            quickSort(array, pi + 1, high);
        }
        return array;
    }

    public static int partition(int[] array, int low, int high) {
        int i = low - 1;
        int j = high + 1;
        int pivot = array[low];
        while (true) {
            do {
                i++;
            } while (array[i] < pivot);
            do {
                j--;
            } while (array[j] > pivot);
            if (i >= j) {
                return j;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String args[]) {
        //int[] array = {54, 26, 93, 17, 77, 31, 44, 55, 20};
        int[] array = {2, 6, 5, 3, 8, 7, 1, 0};
        String output = Arrays.stream(quickSort(array, 0, array.length - 1)).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(output);
        Arrays.stream(quickSort(array, 0, array.length - 1)).forEach(System.out::println);
    }


}
