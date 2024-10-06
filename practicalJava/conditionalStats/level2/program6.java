package conditional.level2;

import java.util.Scanner;
import java.util.Arrays;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long[] a = new long[3];

        for (int b = 0; b < 3; b++) {
            a[b] = obj.nextLong();
        }

        Arrays.sort(a);

        System.out.printf("%d < %d < %d\n", a[0], a[1], a[2]);

        obj.close();
    }
}