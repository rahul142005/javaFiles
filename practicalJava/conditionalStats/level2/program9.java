package conditional.level2;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if (c < 1900 || c > 9999) {
            System.out.println("Invalid");
        }
        if (b < 1 || b > 12) {
            System.out.println("Invalid");
        }

        int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((c % 4 == 0 && c % 100 != 0) || (c % 400 == 0)) {
            d[1] = 29;
        }

        if (a < 1 || a > d[b - 1]) {
            System.out.println("Invalid");
        }

        System.out.println("Valid");

        obj.close();
    }
}