package basicIO.level3;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        double b = a * 2.20462;

        System.out.printf("%.2f Pounds\n", b);

        obj.close();
    }
}