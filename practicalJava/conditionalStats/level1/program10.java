package conditional.level1;

import java.util.Scanner;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Not Valid");
        }

        obj.close();
    }
}