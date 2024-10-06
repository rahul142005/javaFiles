package basicIO.level1;

import java.util.Scanner;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();
        String b = Double.toString(a);

        b = b.replaceAll("0*$", "");
        b = b.replaceAll("\\.$", "");

        System.out.println(b);

        obj.close();
    }
}