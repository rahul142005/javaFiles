package basicIO.level2;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = a / 3600;
        int c = a % 3600;
        int d = c / 60;
        int e = c % 60;

        System.out.printf("%02d:HOUR %02dMIN :%02dSEC", b, d, e);

        obj.close();
    }
}