package conditional.level2;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if ((a + b + c) == 180) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Not valid");
        }

        obj.close();
    }
}