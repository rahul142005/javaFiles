package looping.level0;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();

        for (long c = 1; c <= a; c++) {
            System.out.printf("%d * %d = %d\n", c, b, (c * b));
        }

        obj.close();
    }
}