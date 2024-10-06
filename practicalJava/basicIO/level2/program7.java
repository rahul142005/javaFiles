package basicIO.level2;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = 3 - a;

        System.out.println(b);

        obj.close();
    }
}