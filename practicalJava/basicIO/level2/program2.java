package basicIO.level2;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = Math.abs(a - b);

        System.out.println(c);

        obj.close();
    }
}