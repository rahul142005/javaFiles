package basicIO.level1;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        char a = obj.next().charAt(0);
        int b = (int) a;

        System.out.printf("%d:%d", a, b);

        obj.close();
    }
}