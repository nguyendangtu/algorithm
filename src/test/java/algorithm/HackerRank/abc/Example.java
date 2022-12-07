package algorithm.HackerRank.abc;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 18/05/2020 - 9:18 PM
 */
public class Example {
    public static void main(String args[]){
        String s1 = "a";
        String s2 = s1;
        String s3 = new String("a");
      /*  System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));*/
        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        System.out.println(third == fourth);
    }
}
