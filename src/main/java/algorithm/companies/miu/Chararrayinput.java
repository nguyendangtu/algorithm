package algorithm.companies.miu;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author : JOHNNGUYEN
 * @since : 7/11/2023, Tue
 **/
public class Chararrayinput {
    public static void main(String[] args) {
        String obj = "abcdefgh";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        int i;
        int j;
        try {
            while ((i = input1.read()) == (j = input2.read())) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
