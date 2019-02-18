package algorithm.dbsHackerRank;

public class RotateSolution {
    public static void main(String args[]) {
        int[] arrays = new int[]{1, 2, 3};
        System.out.println("Before:");
        for (int i : arrays) {
            System.out.println(i);
        }
        System.out.println("After:");
        int[] rotate = rotate(arrays, "R", 1);
        for (int i : rotate) {
            System.out.println(i);
        }
    }

    public static int[] rotate(int[] arrays, String direction, int k) {
        int sign = direction == "L" ? -k : k;
        int index = 0;
        int[] output = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            index = i + sign;
            if (index < 0) {
                index = arrays.length + index;
            } else if (index > arrays.length - 1) {
                index = index - arrays.length;
            }
            output[index] = arrays[i];
        }

        return output;
    }
}
