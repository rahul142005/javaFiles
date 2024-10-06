package conditional.level2;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral");
        }
        else if (a == b || b == c || c == a) {
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }

        obj.close();
    }
}