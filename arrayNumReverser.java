import java.util.Scanner;

class Output {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);
        
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        
        for (int b = 0; b + 4 <= 10; b += 4) {
            for (int c = b, d = b + 3; c < d; c++, d--) {
                int e = a[c];
                a[c] = a[d];
                a[d] = e;
            }
        }
        
        for (int b = 0; b < 10; b++) {
            System.out.printf("%d ", a[b]);
        }
    }
}
