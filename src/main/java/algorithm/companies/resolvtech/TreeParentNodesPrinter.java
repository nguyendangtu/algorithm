package algorithm.companies.resolvtech;

/**
 * @author : JOHNNGUYEN
 * @since : 8/17/2023, Thu
 **/
public class TreeParentNodesPrinter {

    public static int ParentNodes(int N, int[][] coordinates) {
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println(coordinates[i][0]);
        }
        return N + 1;
    }

    public static void main(String[] args) {
        int N = 5;
        int[][] coordinates = {
                {1, 2},
                {1, 3},
                {2, 4},
                {2, 5},
                {2, 6}
        };

        System.out.println(ParentNodes(N, coordinates));
    }
}