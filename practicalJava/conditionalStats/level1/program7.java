package conditional.level1;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();

        if (a >= 91) {
            System.out.println("Grade A");
        }
        else if (a >= 76 && a <= 90) {
            System.out.println("Grade B");
        }
        else if (a >= 61 && a <= 75) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade D");
        }

        obj.close();
    }
}