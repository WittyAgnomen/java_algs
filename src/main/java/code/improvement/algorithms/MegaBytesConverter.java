package code.improvement.algorithms;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int conversion = 1024;
        int megaBytes = 0;
        int remainder = 0;
        String a = "Invalid Value";

        if (kiloBytes < 0) {
            System.out.println(a);
        }
        else {
            megaBytes = kiloBytes/conversion;
            remainder = kiloBytes % conversion;
            a = Integer.toString(kiloBytes) + " KB = " + Integer.toString(megaBytes) + " MB and " + Integer.toString(remainder) + "KB";
            System.out.println(a);
        }
    }

}