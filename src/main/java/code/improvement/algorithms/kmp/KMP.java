package code.improvement.algorithms.kmp;

/**
 * Kunuth-Morris_Pratt
 * uses longest suffix prefix table
 */
public class KMP {

    public int[] computeLSPTable(char[] pattern) {
        /**
         * computes the tableof the longest suffix and longest prefix on the pattern
         * used by kmp main method algorithm
         *
         * @param pattern
         * @return
         */
        int lsp[] = new int[pattern.length];
        int j = 0;
        for (int i = 1; i < pattern.length; i++) {
            while (j > 0 && pattern[i] != pattern[j]) {
                j = lsp[j-1];
            }
            if (pattern[i] == pattern[j]) {
                lsp[i] = j + 1;
                j++;
            }
            else {
                lsp[i] = 0;
            }
        }
        return lsp;
    }


    public int search(char[] array, char[] pattern) {
        /**
         * This method returns the index for the first match of the pattern into the index.
         * It will return -1 in case it does not match
         *
         * <pre>
         *                 i
         * 0 1 2 3 4 5 6 7 8 9 10111213
         * a b a z a c a b a b a b a c
         *
         *                 a b a b a c
         *                 0 0 1 2 3 0
         *                           j
         * this example returns index of 8
         * </pre>
         *
         * @param array
         * @param pattern
         * @return
         */
        int[] lsp = computeLSPTable(pattern);
        int j=0;
        for (int i=0; i<array.length; i++) {
            while(j>0 && array[i] != pattern[j]) {
                j = lsp[j - 1];
            }
            if (array[i] == pattern[j]) {
                j++;
                if (j == pattern.length) {
                    return (i - (j-1));
                }
            }
        }
        return -1;
    }

}
