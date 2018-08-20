package code.improvement.algorithms.bruteforce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BruteForceTest {

    BruteForce b = null;
    char[] array;

    @Before
    public void init() {
        b = new BruteForce();
        String s = new String("academy.learnprogramming");
        array = s.toCharArray();
    }

    @Test
    public void firstMatchTest() {
        Assert.assertEquals(0, b.firstMatch(array, new char[] {'a'}));
        Assert.assertEquals(16, b.firstMatch(array, new char[] {'g'}));
        Assert.assertEquals(22, b.firstMatch(array, new char[] {'n','g'}));
        Assert.assertEquals(6, b.firstMatch(array, new char[] {'y','.','l','e'}));
        Assert.assertEquals(-1, b.firstMatch(array, new char[] {'z','z'}));
    }

    @Test
    public void everyMatchTest() {
        int[] expect = new int[array.length];
        Arrays.fill(expect,-1);
        expect[0] = 0;
        expect[1] = 2;
        expect[2] = 10;
        expect[3] = 18;
        Assert.assertArrayEquals(expect, b.everyMatch(array, new char[] {'a'}));

    }
}
