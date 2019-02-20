package algorithm.HackerRank.dbsHackerRank;


public class Comparator {

    boolean compare(int a, int b) {
        return a == b;
    }

    boolean compare(String a, String b) {
        if (null == a || null == b) {
            return false;
        }
        return a.equals(b);
    }

    boolean compare(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}
