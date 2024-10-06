package basicIO.level3;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        double b = ((a - 32) * (5 / 9));

        System.out.printf("%.2f Celsius\n", b);

        obj.close();
    }
}