package looping.level1;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        int b = obj.nextInt();
        long c = 1;

        for (int d = 0; d < b; d++) {
            c *= a;
        }

        System.out.println(c);

        obj.close();
    }
}