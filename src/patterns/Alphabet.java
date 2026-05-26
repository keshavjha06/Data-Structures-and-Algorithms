package patterns;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // System.out.print((char)(j + 64) + " "); // A - 65 , a - 97
                // System.out.print((char)(j + 96) + " ");
                // System.out.print((char)(i + 64) + " ");
                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }
    }
}
