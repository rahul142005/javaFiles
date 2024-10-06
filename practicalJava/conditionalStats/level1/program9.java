package conditional.level1;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        double b = 0.0;

        if (a <= 50) {
            b = a * 0.5;
        }
        else if (a <= 150) {
            b = 50 * 0.5 + (a - 50) * 0.75;
        }
        else if (a <= 250) {
            b = 50 * 0.5 + 100 * 0.75 + 100 * 1.2 + (a - 250) * 1.5;
        }

        b *= 1.2;

        System.out.printf("%.2f\n", b);

        obj.close();
    }
}