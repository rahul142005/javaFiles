package basicIO.level1;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        String a = obj.next();
        int b = Integer.parseInt(a.substring(2), 16);

        System.out.println(b);

        obj.close();
    }
}