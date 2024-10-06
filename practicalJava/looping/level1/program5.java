package looping.level1;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = 0;
        long d = a;

        while (d >= b) {
            d -= b;
            c++;
        }

        System.out.println(c);

        obj.close();
    }
}