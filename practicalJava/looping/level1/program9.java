package looping.level1;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = 1;
        long c = 1;

        System.out.printf("1 1 ");

        for (long d = 3; d <= a; d++) {
            long e = b + c;

            System.out.printf(" %d", e);

            b = c;
            c = e;
        }

        obj.close();
    }
}