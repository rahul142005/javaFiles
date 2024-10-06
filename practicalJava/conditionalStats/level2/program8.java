package conditional.level2;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if ((a >= 0 && a < 24) && (b >= 0 && b < 60) && (c >= 0 && c < 60)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Not Valid");
        }

        obj.close();
    }
}