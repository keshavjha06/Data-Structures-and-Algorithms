package loops;

import java.util.Scanner;

public class printseries {
    public static void main(String[] args) {
        // print this series -99,95,91,87..upto all terms which are positive

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        for (int i = 99; i >= n; i = i - 4) {
            if (i > 0)
                System.out.println(i + " ");
        }

    }
}
