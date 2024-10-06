package basicIO.level1;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        double a = obj.nextDouble();

        System.out.printf("%20.4f", a);

        obj.close();
    }
}