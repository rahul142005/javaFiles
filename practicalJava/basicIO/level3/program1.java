package basicIO.level3;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        double b = (((a * 9) / 5) + 32);

        System.out.printf("%.2f\n", b);

        obj.close();
    }
}