package looping.level1;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        long a = obj.nextLong();
        String b = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

        for (long c = 0; c < a; c++) {
            System.out.println(b);
        }

        obj.close();
    }
}