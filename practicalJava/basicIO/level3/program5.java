package basicIO.level3;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        double b = a / 1.6;

        System.out.printf("%.2f Miles\n", b);

        obj.close();
    }
}