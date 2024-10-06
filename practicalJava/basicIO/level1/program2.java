package basicIO.level1;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        char b = (char) a;

        System.out.printf("%d:%d", a, b);

        obj.close();
    }
}