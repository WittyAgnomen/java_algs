package code.improvement.algorithms.controlflow;

public class cfFor {

    public static void main(String [] args) {

//        for (init, termination, increment)

        for (int i=0; i<5; i++) {
            System.out.println("10,000 at " +  i + "% interest = " + calculateInterest(10000.0, i));

        }
    }

    public static  double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
