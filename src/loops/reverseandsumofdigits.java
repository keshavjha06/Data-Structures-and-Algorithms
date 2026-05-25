package loops;

import java.util.Scanner;

public class reverseandsumofdigits {
    // 1234 reverse is 4321 and sum of both is 5555
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10;
            rev = rev + n % 10;
            n = n / 10;
        }
        int sum = original + rev;
        System.out.println("Reverse: " + rev);
        System.out.println("Sum of number and its reverse: " + sum);
    }
}
