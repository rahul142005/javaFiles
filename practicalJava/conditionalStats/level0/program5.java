package conditional.level0;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = 0;

        if (a < b) {
            c = a;
        }
        else {
            c = b;
        }

        System.out.printf("Minimum of %d and %d is %d", a, b, c);

        obj.close();
    }
}