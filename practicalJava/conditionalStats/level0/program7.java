package conditional.level0;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        long a = obj.nextLong();

        if (a > 0) {
            System.out.println("POSITIVE");
        }
        else if (a < 0) {
            System.out.println("NEGATIVE");
        }
        else {
            System.out.println("ZERO");
        }

        obj.close();
    }
}