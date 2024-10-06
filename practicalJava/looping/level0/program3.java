package looping.level0;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();

        if (a % 2 != 0) {
            a++;
        }
        if (b % 2 != 0) {
            b--;
        }
        
        if (a > b) {
            System.out.println(0);
        }

        long c = ((b - a) / 2 + 1);
        long d = (c * (a + b) / 2);

        System.out.println(d);

        obj.close();
    }
}