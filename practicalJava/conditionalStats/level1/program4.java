package conditional.level1;

import java.util.Scanner;

public class program4 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        char a = obj.next().charAt(0);

        if (Character.isUpperCase(a)) {
            System.out.println("UPPERCASE");
        }
        else if (Character.isLowerCase(a)) {
            System.out.println("LOWERCASE");
        }
        else {
            System.out.println("NONE");
        }

        obj.close();
    }
}