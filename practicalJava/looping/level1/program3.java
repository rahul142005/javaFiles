package looping.level1;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = a;
        long c = 2;
        long d = 1;

        if (a == 0) {
            System.out.println(1);
        }

        while (c * c <= b) {
            if (b % (c * c) == 0) {
                d *= c;
                b /= c * c;
            }

            else {
                c++;
            }
        }
        
        if (b > 1) {
            d *= b;
        }

        System.out.println(d);

        obj.close();
    }
}