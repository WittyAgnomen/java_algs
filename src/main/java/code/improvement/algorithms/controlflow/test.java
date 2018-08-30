package code.improvement.algorithms.controlflow;

public class test {

    public static void main(String [] args) {
        System.out.println(hasSharedDigit(23,42));

    }

  public static boolean hasSharedDigit(int f, int s) {
    if ((s < 10)||(s > 99)||(f < 10)||(f > 99)) { return false; }
    int first = s % 10;
    int second = (s/10 != 0) ? (s/10)%10 : -1;
    int num;

    do {
        num = f % 10;
        f = f/10;
        if (num == first || num ==second) {return true;}
    }
    while (f != 0);

    return false;
        }
}
