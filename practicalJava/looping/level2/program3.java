package looping.level2;

import java.util.Scanner;

public class program3 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        
        for (long b = 0; b < a; b++) {
            if (b % 2 == 0) {
                System.out.printf("%d ", ((b / 2) * 2));
            }
            else {
                System.out.printf("%d ", (b / 2));
            }
        }

        obj.close();
    }
}