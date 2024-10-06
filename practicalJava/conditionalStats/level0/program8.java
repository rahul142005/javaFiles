package conditional.level0;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        long a = obj.nextLong();

        if (a % 3 == 0) {
            System.out.println("HI");
        }
        else if (a % 5 == 0) {
            System.out.println("HELLO");
        }
        else {
            System.out.println("HIHELLO");
        }

        obj.close();
    }
}