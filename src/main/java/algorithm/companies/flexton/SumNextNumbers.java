package algorithm.companies.flexton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * // /*
 * // Given an array of integers, return an
 * // list of integers which contains
 * // [1st integer, Sum of next 2 integers
 * // (2nd, 3rd), Sum of next 3 integers (4th, 5th, 6th)] and so on
 * // so on means sum up next 4 , next 5, next 6, next 7
 * // Input
 * // [1,6,8,5,9,4,7,2]
 * // Output
 * // [1,14,18,9]
 * <p>
 * // in the result
 * // 1st Value - 1
 * // 2nd Value - 6 + 8 -> 14
 * // 3rd Value - 5 + 9 + 4 -> 18
 * // 4th Value - 7 + 2 -> Sum of next Four elements but four elements
 * //  are not present in the array
 * // so will sum up the remaining values -> 9
 * // Your algorithms should work for assuming there can be n elements in the array
 *
 * @author : JOHNNGUYEN
 * @since : 8/12/2023, Sat
 **/
public class SumNextNumbers {
    public static void main(String[] args) {
        Arrays.stream(sum(new int[]{1, 6, 8, 5, 9, 4, 7, 2})).forEach(System.out::println);
    }

    public static int[] sum(int[] numbers) {
        List<Integer> output = new ArrayList<>();
        int jump = 2;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
            if (count == jump || i == numbers.length - 1) {
                output.add(sum);
                jump++;
                count = 0;
                sum = 0;
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}
