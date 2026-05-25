package loops;

import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int rev = 0;
        while (num != 0) {
            rev = rev * 10;
            rev = rev + num % 10;
            num = num / 10;
        }
        System.out.println("The Reverse is: " + rev);

    }
}
