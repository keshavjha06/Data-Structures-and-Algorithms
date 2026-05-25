package loops;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num < 0)
            num = -num;
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum is: " + sum);

    }
}

// 5 % 10 = 5 , a % b = a if ( a < b)
// (-a) % b = - (a % b)
