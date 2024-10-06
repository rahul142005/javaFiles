package conditional.level1;

import java.util.Scanner;

public class program6 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        char a = obj.next().charAt(0);

        if (Character.isLetter(a)) {
            System.out.println("ALPHABET");
        }
        else if (Character.isDigit(a)) {
            System.out.println("NUMBER");
        }
        else {
            System.out.println("SPECIAL CHARACTER");
        }

        obj.close();
    }
}