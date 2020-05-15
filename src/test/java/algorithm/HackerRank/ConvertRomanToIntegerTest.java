package algorithm.HackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 15/05/2020 - 9:26 AM
 */
public class ConvertRomanToIntegerTest {
    @Test
    public void testParseFromRomanToInteger_1() {
        assertEquals(1, ConvertRomanToInteger.parseFromRomanToInteger("I"));
    }

    @Test
    public void testParseFromRomanToInteger_2() {
        assertEquals(2, ConvertRomanToInteger.parseFromRomanToInteger("II"));
    }

    @Test
    public void testParseFromRomanToInteger_3() {
        assertEquals(3, ConvertRomanToInteger.parseFromRomanToInteger("III"));
    }

    @Test
    public void testParseFromRomanToInteger_5() {
        assertEquals(5, ConvertRomanToInteger.parseFromRomanToInteger("V"));
    }

    @Test
    public void testParseFromRomanToInteger_6() {
        assertEquals(6, ConvertRomanToInteger.parseFromRomanToInteger("VI"));
    }

    @Test
    public void testParseFromRomanToInteger_7() {
        assertEquals(7, ConvertRomanToInteger.parseFromRomanToInteger("VII"));
    }

    @Test
    public void testParseFromRomanToInteger_8() {
        assertEquals(8, ConvertRomanToInteger.parseFromRomanToInteger("VIII"));
    }

    @Test
    public void testParseFromRomanToInteger_10() {
        assertEquals(10, ConvertRomanToInteger.parseFromRomanToInteger("X"));
    }

    @Test
    public void testParseFromRomanToInteger_20() {
        assertEquals(20, ConvertRomanToInteger.parseFromRomanToInteger("XX"));
    }

    @Test
    public void testParseFromRomanToInteger_4() {
        assertEquals(4, ConvertRomanToInteger.parseFromRomanToInteger("IV"));
    }

    @Test
    public void testParseFromRomanToInteger_() {
        assertEquals(4, ConvertRomanToInteger.parseFromRomanToInteger("IV"));
    }

}