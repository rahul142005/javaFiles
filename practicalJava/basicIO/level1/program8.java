package basicIO.level1;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        float a = obj.nextFloat();

        System.out.printf("%e", a);

        obj.close();
    }
}