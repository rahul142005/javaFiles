package looping.level0;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();

        if ((a & (a - 1)) == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

        obj.close();
    }
}