package code.improvement.algorithms.bruteforce;


import java.util.Arrays;

/**
 * Brute Force Algorithm<BR>
 *  It will search for a pattern into an array
 *  and if the the patten is found it will
 *  return the first index of the letter found
 *  else return -1
 */
public class BruteForce {

    /**
     * This method searches for a pattern in the array and return the index of the first character in the match
     * array = abcadef
     * pattern = def -> 4
     * @param array
     * @param pattern
     * @return
     */

    public int firstMatch(char[] array, char[] pattern) {
        for (int  a = 0; a <= array.length-pattern.length; a++) {
            for (int p = 0; p < pattern.length; p++) {
                if (array[a+p] != pattern[p]) break;
                if (p == pattern.length-1) return a;
            }
        }
        return -1;
    }

    public int[] everyMatch(char[] array, char[] pattern) {
        int[] found = new int[array.length];
        Arrays.fill(found, -1);
        int index = 0;
        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int p = 0; p < pattern.length; p++) {
                if (array[a + p] != pattern[p]) break;
                if (p == pattern.length - 1) {
                    found[index++] = a;
                }
            }
        }
        return found;
    }

}
