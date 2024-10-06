package conditional.level1;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        double b, c;

        if (a <= 10000) {
            b = 0.2 * a;
            c = 0.8 * a;
        }
        else if (a <= 20000) {
            b = 0.25 * a;
            c = 0.9 * a;
        }
        else {
            b = 0.3 * a;
            c = 0.95 * a;
        }

        System.out.printf("Rs.%.2f\n", (a + b + c));

        obj.close();
    }
}