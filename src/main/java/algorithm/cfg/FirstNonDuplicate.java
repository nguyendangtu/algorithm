package algorithm.cfg;

import java.util.HashMap;

public class FirstNonDuplicate {
    public static final int NO_OF_CHARS = 256;

    public HashMap<Character, CountIndex> getStringMap(String str) {
        HashMap<Character, CountIndex> hashMap = new HashMap<>(NO_OF_CHARS);
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                hashMap.get(str.charAt(i)).countIncrement();
            } else {
                hashMap.put(str.charAt(i), new CountIndex(i));
            }
        }
        return hashMap;
    }

    public int getFirstNonDuplicate(String str) {
        Integer result = Integer.MAX_VALUE;
        HashMap<Character, CountIndex> hashMap = getStringMap(str);
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)).getCount() == 1) {
                return i;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        FirstNonDuplicate firstNonDuplicate = new FirstNonDuplicate();
        String str = "ABCDEFGKLMNA";
        int index = firstNonDuplicate.getFirstNonDuplicate(str);
        System.out.println("the value is = " + str.charAt(index));
    }

}






