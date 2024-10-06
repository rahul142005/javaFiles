package looping.level2;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = 1;
        long c = 1;

        for (long d = 1; d <= a; d++) {
            if (d % 2 == 1) {
                System.out.printf("%d ", b);
                b *= 2;
            }
            else {
                System.out.printf("%d ", c);
                c *= 3;
            }
        }

        obj.close();
    }
}