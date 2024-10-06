package basicIO.level2;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = a;

        a = b;
        b = c;

        System.out.printf("num1=%d", a);
        System.out.printf("num2=%d", b);

        obj.close();
    }
}