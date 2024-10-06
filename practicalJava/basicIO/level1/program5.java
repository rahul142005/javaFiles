package basicIO.level1;

import java.util.Scanner;

public class program5 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        int b = obj.nextInt();
        String c = "%." + b + "f";

        System.out.printf(c, a);

        obj.close();
    }
}