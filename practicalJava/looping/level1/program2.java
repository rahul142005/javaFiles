package looping.level1;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = (long) Math.cbrt(a);

        if (b * b * b == a) {
            System.out.println("Perfect Cube");
        }
        else {
            System.out.println("Not a Perfect Cube");
        }

        obj.close();
    }
}