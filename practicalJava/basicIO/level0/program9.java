package basicIO.level0;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        long a = obj.nextLong();
        long b = obj.nextLong();
        
        System.out.printf("%05d\n", a);
        System.out.printf("%5d\n", b);
        
        obj.close();
    }
}