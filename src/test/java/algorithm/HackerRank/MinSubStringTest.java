package algorithm.HackerRank;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 23/05/2020 - 11:44 AM
 */
public class MinSubStringTest {

    @Test
    public void findShortedSubString_1() {
        String subString = "abc";
        String input = "adebcafbc";
        String output = MinSubString.findShortedSubStringWithOrder(input, subString);
        Assert.assertEquals("afbc", output);
    }

    @Test
    public void findShortedSubString_2() {
        String subString = "abcab";
        String input = "abcdeafbabcdab";
        String output = MinSubString.findShortedSubStringWithOrder(input, subString);
        Assert.assertEquals("abcdab", output);
    }


   // @Test
    public void minWindow_1() {
        String input = "ADOBECODEBANC";
        String subString = "ABC";
        String output = MinSubString.minWindow(input, subString);
        Assert.assertEquals("BANC", output);
    }



}