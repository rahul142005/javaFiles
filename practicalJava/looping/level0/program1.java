package looping.level0;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();

        if (a % 2 != 0) {
            a++;
        }

        for (long c = a; c <= b; c += 2) {
            System.out.printf("%d ", c);
        }

        obj.close();
    }
}