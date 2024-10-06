package basicIO.level2;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = obj.nextLong();
        double c = (double) a / b;
        long d = a % b;

        System.out.printf("The quotient when %d is divided by %d is %.16f\n", a, b, c);
        System.out.printf("The remainder when %d is divided by %d is %d\n", a, b, d);

        obj.close();
    }
}