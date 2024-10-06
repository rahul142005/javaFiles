package looping.level0;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = Long.MAX_VALUE;
        long b = Long.MIN_VALUE;
        long c = 0;
        long d = 0;

        while (true) {
            long e = obj.nextLong();

            if (e == -1) {
                break;
            }
            else if (e < a) {
                a = e;
            }
            else if (e > b) {
                b = e;
            }

            c += e;
            d++;
        }

        double f = (d > 0) ? (double) c / d : 0.0;

        System.out.printf("Min = %d\n", a);
        System.out.printf("Max = %d\n", b);
        System.out.printf("Sum = %d\n", c);
        System.out.printf("Average = %.6f\n", f);

        obj.close();
    }
}