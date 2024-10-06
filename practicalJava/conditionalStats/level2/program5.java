package conditional.level2;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = obj.nextLong();
        long d = obj.nextLong();
        long e = a;

        if (b > e) {
            e = b;
        }
        if (c > e) {
            e = c;
        }
        if (d > e) {
            e = d;
        }

        System.out.printf("Maximum is %d", d);

        obj.close();
    }
}