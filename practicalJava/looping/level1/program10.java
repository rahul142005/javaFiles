package looping.level1;

import java.util.Scanner;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b;

        for (b = 1; b <= a; b++) {
            if (b % 4 == 0) {
                obj.close();
                continue;
            }
        }

        System.out.printf("%d ", b);

        obj.close();
    }
}