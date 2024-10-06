package looping.level2;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        boolean b = false;

        for (long c = 1; c * c < a; c++) {
            long d = 1;

            while (d <= a) {
                d *= 2;
            }

            d /= 2;

            if ((d > c) && (d * c + 1 == a)) {
                b = true;
                break;
            }
        }

        if (b) {
            System.out.println("Proth Number");
        }
        else {
            System.out.println("Not a Proth Number");
        }

        obj.close();
    }
}