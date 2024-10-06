package looping.level2;

import java.time.LocalDate;
import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = LocalDate.of(c, b, a).getDayOfYear();

        System.out.println(d);

        obj.close();
    }
}