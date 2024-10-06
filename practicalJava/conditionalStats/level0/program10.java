package conditional.level0;

import java.util.Scanner;

public class program10 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        char a = obj.next().charAt(0);

        if ((a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') || (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')) {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

        obj.close();
    }
}