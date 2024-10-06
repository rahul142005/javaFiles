package looping.level2;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int d = obj.nextInt();
        int e = obj.nextInt();
        int f = obj.nextInt();
        int g = a * 3600 + b * 60 + c;
        int h = d * 3600 + e * 60 + f;
        int i = Math.abs(h - g);

        System.out.println(i);

        obj.close();
    }
}