package looping.level2;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = (24 * a + 1);
        long c = (long) Math.sqrt(b);

        if (c * c == b && (c + 1) % 6 == 0) {
            System.out.println("Pentagonal Number");
        }
        else {
            System.out.println("Not a Pentagonal Number");
        }

        obj.close();
    }
}