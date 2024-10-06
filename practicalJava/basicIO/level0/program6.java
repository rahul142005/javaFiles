package basicIO.level0;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        long a = obj.nextLong();
        
        System.out.println(a);
        
        obj.close();
    }
}