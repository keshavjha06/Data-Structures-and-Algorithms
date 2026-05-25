package loops;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        // sequence : 1, 10, 2, 9, 3, 8, 4, 7, 5, 6
        // n = 11
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print((i + 1) / 2 + " ");
            } else {
                System.out.print(n - i / 2 + " ");
            }
        }

    }
}
