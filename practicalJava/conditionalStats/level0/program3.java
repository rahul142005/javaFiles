package conditional.level0;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        int a = obj.nextInt();
        int b = a % 3;

        if (a % 3 == 0) {
            System.out.println("The number is divisible by 3");
        }
        else {
            System.out.printf("The number is not divisible by 3 and gives a remainder %d", b);
        }

        obj.close();
    }
}