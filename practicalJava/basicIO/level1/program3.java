package basicIO.level1;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();

        System.out.printf("%.2f", a);

        obj.close();
    }
}