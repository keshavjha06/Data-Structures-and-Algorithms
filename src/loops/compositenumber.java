package loops;

import java.util.Scanner;

public class compositenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag = true; // true means prime

        for (int i = 2; i <= n - 1; i++) { // or i <= Math.sqrt(n) // 1 & n are obvious factors , so 2 to n - 1 needs to be checked
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        if (n == 1)
            System.out.println("Neither Prime nor Composite");
        else if (flag == false)
            System.out.println("Composite Number");
        else
            System.out.println("Prime Number");

    }
}
