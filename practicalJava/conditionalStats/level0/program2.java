package conditional.level0;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        int a = obj.nextInt();

        if (a % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

        obj.close();
    }
}