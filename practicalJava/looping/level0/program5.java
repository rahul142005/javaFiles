package looping.level0;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        long b = 1;

        for (int c = 1; c <= a; c++) {
            b *= c;
        }

        System.out.println(b);

        obj.close();
    }
}