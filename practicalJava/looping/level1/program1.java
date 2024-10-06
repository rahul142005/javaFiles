package looping.level1;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = (long) Math.sqrt(a);

        if (b * b == a) {
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not");
        }

        obj.close();
    }
}