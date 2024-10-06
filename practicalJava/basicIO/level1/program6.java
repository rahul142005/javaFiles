package basicIO.level1;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();

        System.out.println(Math.round(a));

        obj.close();
    }
}