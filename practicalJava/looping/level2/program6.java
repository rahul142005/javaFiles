package looping.level2;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        long b = 0;
        long c = 0;

        for (int d = 1; d <= a; d++) {
            long e = d * 10;

            switch ((d - 1) % 4) {
                case 0:
                    b += e;
                    break;
                case 1:
                    c -= e;
                    break;
                case 2:
                    b -= e;
                    break;
                case 3:
                    c += e;
                    break;
            }
        }

        System.out.printf("(%d, %d)", b, c);

        obj.close();
    }
}