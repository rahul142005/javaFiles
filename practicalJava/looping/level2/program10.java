package looping.level2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();
        int e = obj.nextInt();
        int f = obj.nextInt();

        if ((c < 1200 || c > 9999 || f < 1200 || f > 9999) || (b < 1 || b > 12 || e < 1 || e > 12)) {
            System.out.println("Invalid");
        }

        int[] g = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean h = (c % 4 == 0 && c % 100 != 0) || (c % 400 == 0);
        boolean i = (f % 4 == 0 && f % 100 != 0) || (f % 400 == 0);

        if (h) {
            g[1] = 29;
        }
        if (i) {
            g[1] = 29;
        }

        if (a < 1 || a > g[b - 1] || d < 1 || d > g[e - 1]) {
            System.out.println("Invalid");
        }

        long j = ChronoUnit.DAYS.between(LocalDate.of(c, b, a), LocalDate.of(f, e, d));

        System.out.println(Math.abs(j));

        obj.close();
    }
}