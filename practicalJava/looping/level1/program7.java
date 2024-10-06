package looping.level1;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = 1;
        long c = 1;

        while (c < a) {
            b++;
            c += b;
        }

        if (c == a) {
            System.out.println("Triangular Number");
        }
        else {
            System.out.println("Not a Triangular Number");
        }

        obj.close();
    }
}