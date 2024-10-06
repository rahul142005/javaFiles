package basicIO.level0;

import java.util.Scanner;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        int a = obj.nextInt();
        
        System.out.printf("%+d\n", a);
        
        obj.close();
    }
}