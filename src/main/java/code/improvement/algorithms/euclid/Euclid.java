package code.improvement.algorithms.euclid;

/**
 *  euclid algorithm
 *  it calculates the GCD: greatest common divisor between two numbers A and B
 */

public class Euclid {
    /**
     * Implementation using recursion<BR>
     *     22/6 = 3 remainder 4
     *     6/4 = 1 remainder 2
     *     4/2 = 2 remainder 0
     * @param number
     * @param divisor
     * @return
     */

    public int gcd(int number, int divisor) {
        int remainder = (number % divisor);
        if (remainder != 0) {
            return gcd(divisor, remainder);
        }
        else {
            return divisor;
        }

    }

    /**
     * Implementation w/o recursion<BR>
     *     22/6 = 3 remainder 4
     *     6/4 = 1 remainder 2
     *     4/2 = 2 remainder 0
     *
     *     number/(temp)= result rest of divisor
     * @param number
     * @param divisor
     * @return
     */

    public int gcd2(int number, int divisor) {
        while(divisor != 0) {
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;

        }
        return number;
    }





}
