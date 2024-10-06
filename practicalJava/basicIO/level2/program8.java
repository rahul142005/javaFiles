package basicIO.level2;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = Math.abs(a);

        System.out.println(b);

        obj.close();
    }
}