import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 8/15/2023, Tue
 **/
public class NewClass {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6);
        //merge list 2 with list 1
        //after merge, list 1.
        //OUTPUT: LIST 1: 1,2,3,4,5,6
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();
        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        result.forEach(System.out::println);
    }
}
