package looping.level1;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = 0;
        long d = a;

        for (long e = 0; e < b; e++) {
            c += d;
        }

        System.out.println(c);

        obj.close();
    }
}