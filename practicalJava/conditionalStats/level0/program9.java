package conditional.level0;

import java.util.Scanner;

public class program9 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        long a = obj.nextLong();
        char b = obj.next().charAt(0);

        if (a != 0) {
            if (b == 'R') {
                System.out.printf("(%d,0)", a);
            }
            else {
                System.out.printf("(-%d,0)", a);
            }
        }
        else {
            System.out.println("(0,0)");
        }

        obj.close();
    }
}