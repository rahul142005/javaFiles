package basicIO.level0;

import java.util.Scanner;

public class program7 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        char a = obj.next().charAt(0);
        
        System.out.println(a);
        
        obj.close();
    }
}