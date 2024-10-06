package looping.level0;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = 0;

        for (long c = 1; c <= a; c++) {
            if (c % 3 == 0 || c % 5 == 0) {
                b += c;
            }
        }

        System.out.println(b);

        obj.close();
    }
}