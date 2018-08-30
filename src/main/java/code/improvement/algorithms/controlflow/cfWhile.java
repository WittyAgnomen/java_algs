package code.improvement.algorithms.controlflow;

public class cfWhile {

    public static void main(String [] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("count is " + count);
            count++;
        }

        int c = 1;
        while(true) {
            if ( c == 6 ) {
                break;
            }
            System.out.println("count is " + c);
            c++;
        }

        int co = 4;
        do {
            System.out.println("count is " + co);
            co++;
        }
        while (co != 6);

    }


}




