package basicIO.level2;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("num1=%d", a);
        System.out.printf("num2=%d", b);

        obj.close();
    }
}