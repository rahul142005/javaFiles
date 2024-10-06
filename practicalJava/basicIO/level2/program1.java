package basicIO.level2;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();
        long c = a + b;

        System.out.printf("Sum of %d and %d is %d", a, b, c);

        obj.close();
    }
}