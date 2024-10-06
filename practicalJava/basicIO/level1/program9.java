package basicIO.level1;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        String b = Integer.toHexString(a);

        System.out.println(b);

        obj.close();
    }
}