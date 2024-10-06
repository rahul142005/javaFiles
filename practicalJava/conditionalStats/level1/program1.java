package conditional.level1;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();

        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }

        obj.close();
    }
}