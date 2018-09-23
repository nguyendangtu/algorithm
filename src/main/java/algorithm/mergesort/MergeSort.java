package algorithm.mergesort;

import java.util.Arrays;
import java.util.stream.Collectors;

/***
 * This class using for building quick sort algorithm
 */
public class MergeSort {
    private static int count = 0;
    public static void main(String args[]) {
//        int[] array = new int[]{38, 27, 43, 3, 9, 82, 10};
       // int[] array = new int[]{1, 4, 3, 2, 5};
         int[] array = new int[]{7, 8, 9, 1,2, 3};
        System.out.println("input:" + Arrays.stream(array).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(",")));
        mergeSort(array, 0, array.length - 1);
        System.out.println("output:" + Arrays.stream(array).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining(",")));

    }


    public static final void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    public static final void merge(int[] array, int start, int middle, int end) {
        int leftSide = start;
        int rightSide = middle + 1;
        int[] mergeArray = new int[end - start + 1];
        int mergeArrayIndex = 0;
        for (int i = start; i <= end; i++) {
            if (leftSide > middle) {
                mergeArray[mergeArrayIndex++] = array[rightSide++];
            } else if (rightSide > end) {
                mergeArray[mergeArrayIndex++] = array[leftSide++];
            } else if (array[leftSide] < array[rightSide]) {
                mergeArray[mergeArrayIndex++] = array[leftSide++];
            } else {
                mergeArray[mergeArrayIndex++] = array[rightSide++];
                count = count + (middle-leftSide+1);
                System.out.println("count="+count);
            }
        }

        for (int i = 0; i < mergeArrayIndex; i++) {
            array[start++] = mergeArray[i];

        }
        //System.out.println("input-" + ":" + Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }
}
