package loops;

import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        int pow = 1;
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        System.out.println(a + " raised to the power " + b + " is " + pow);
    }
}
