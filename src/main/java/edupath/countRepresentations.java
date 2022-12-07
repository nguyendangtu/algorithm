package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 26/04/2022 - 12:04 PM
 */
public class countRepresentations {
    public static void main(String args[]) {
        System.out.println(countRepresentations(12));
    }

    public static int countRepresentations(int numRupees) {
        int count = 0;
        for (int r20 = 0; r20 <= numRupees / 20; r20++) {
            for (int r10 = 0; r10 <= numRupees / 10; r10++) {
                for (int r5 = 0; r5 <= numRupees / 5; r5++) {
                    for (int r2 = 0; r2 <= numRupees / 2; r2++) {
                        for (int r1 = 0; r1 <= numRupees; r1++) {
                            if (r20 * 20 + r10 * 10 + r5 * 5 + r2 * 2 + r1 == numRupees) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
