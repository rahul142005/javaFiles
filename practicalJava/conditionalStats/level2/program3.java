package conditional.level2;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = obj.nextLong();
        long d = a;

        if (b < d) {
            d = b;
        }
        if (c < d) {
            d = c;
        }

        System.out.printf("Minimum is %d", d);

        obj.close();
    }
}