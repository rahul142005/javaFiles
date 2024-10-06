package basicIO.level2;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        double b = obj.nextDouble();
        double c = a * b;

        System.out.printf("%.2f", c);

        obj.close();
    }
}