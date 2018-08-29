package code.improvement.algorithms.controlflow;

public class cfSwitch {

    public static void main(String Args []) {

        char charValue = 'f';
        switch(charValue) {
            case 'a':
                System.out.println("value was a");
                break;

            case 'b':
                System.out.println(("value was b"));
                break;

            case 'c': case 'd': case 'e':
                System.out.println(("value was c, d, or e"));
                break;

            default:
                System.out.println("value was not a, b, c, d, or e");
        }

    }
}


