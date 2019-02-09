package datastructure;

import java.util.Arrays;
import java.util.stream.Collectors;

/***
 * Array is a collection of items stored at contiguous memory allocation. An Array will have size, index, value at index
 *
 */
public class MyArray {
    public static void main(String args[]) {
        String[] arrays = new String[]{"HAPPY", "NEW", "YEAR", "2019"};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        System.out.println(Arrays.stream(arrays).collect(Collectors.joining(" ")));
    }
}