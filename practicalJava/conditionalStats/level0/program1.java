package conditional.level0;

import java.util.Scanner;

public class program1 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        long a = obj.nextLong();
        long b = obj.nextLong();

        if (a == b) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

        obj.close();
    }
}