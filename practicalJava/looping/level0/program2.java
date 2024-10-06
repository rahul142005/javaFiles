package looping.level0;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        long b = a * a;

        System.out.println(b);

        obj.close();
    }
}