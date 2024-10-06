package looping.level2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = Year.of(c).length();
        int e = LocalDate.of(c, b, a).getDayOfYear();
        int f = d - e;

        System.out.println(f);

        obj.close();
    }
}