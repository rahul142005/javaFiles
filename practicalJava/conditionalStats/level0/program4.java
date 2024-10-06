package conditional.level0;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        int a = obj.nextInt();

        if (a < 35) {
            System.out.println("FAIL");
        }
        else {
            System.out.println("PASS");
        }

        obj.close();
    }
}