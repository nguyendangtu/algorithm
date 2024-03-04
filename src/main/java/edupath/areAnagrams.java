package edupath;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 01/05/2022 - 12:04 PM
 */
public class areAnagrams {
    public static void main(String args[]) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }

    public boolean isAnagram(String s, String t) {
        if(s == null && s== null) return true;
        if(s == null || t== null) return false;
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }


    public static int areAnagrams(char a1[], char a2[]) {
        if (a1 == null && a2 == null) return 1;
        if (a1.length == 0 && a2.length == 0) return 1;
        if (a1 == null && a2 != null) return 0;
        if (a1 != null && a2 == null) return 0;
        if (a1.length != 0 && a2.length == 0) return 0;
        if (a1.length == 0 && a2.length != 0) return 0;

        for (int r = 0; r < a1.length; r++) {
            char rotateArray[] = rotateArray(a2, r);
            int count = 0;
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] == rotateArray[i]) {
                    count++;
                }
            }
            if (count == a1.length) {
                return 1;
            }
        }
        return 0;
    }

    public static char[] rotateArray(char a[], int n) {
        char result[] = new char[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            result[j++] = a[(i + n) % a.length];
        }
        return result;
    }


    public static void printArrays(int a[]) {
        if (a == null) {
            System.out.println("null");
            return;
        }
        if (a.length == 0) {
            System.out.println("{}");
            return;
        }
        for (int i : a) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
