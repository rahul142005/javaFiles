package conditional.level1;

import java.util.Scanner;

public class program8 {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        char b = obj.next().charAt(0);
        int c = obj.nextInt();

        switch (b) {
            case '+':
                System.out.println(a + c);
                break;
            case '-':
                System.out.println(a - c);
                break;
            case '*':
                System.out.println(a * c);
                break;
            case '/':
                System.out.println(a / c);
                break;
        }

        obj.close();
    }
}