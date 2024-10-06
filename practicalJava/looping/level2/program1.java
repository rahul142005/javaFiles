package looping.level2;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = 0;
        long c = 5;

        while (a >= c) {
            b += a / c;
            c *= 5;
        }

        System.out.println(b);

        obj.close();
    }
}