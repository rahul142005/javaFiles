package conditional.level2;

import java.util.Scanner;
import java.util.Arrays;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long[] a = new long[4];

        for (int b = 0; b < 4; b++) {
            a[b] = obj.nextLong();
        }

        Arrays.sort(a);

        System.out.printf("%d > %d > %d\n", a[3], a[2], a[1], a[0]);

        obj.close();
    }
}