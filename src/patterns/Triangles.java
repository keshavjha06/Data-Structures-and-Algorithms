package patterns;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print(" * "+ " ");
                // System.out.print(j + " ");
                // System.out.print(i + " ");
                // System.out.print((char)(j + 64) + " ");
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }
}
