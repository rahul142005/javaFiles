package basicIO.level2;

import java.util.Scanner;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = a / 365;
        int c = a % 365;
        int d = c / 7;
        int e = c % 7;

        System.out.printf("Number of Years:%d", b);
        System.out.printf("Number of Week:%d", d);
        System.out.printf("Number of Days:%d", e);

        obj.close();
    }
}