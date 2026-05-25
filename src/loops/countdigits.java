package loops;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n == 0)
            n = 1;
        int count = 0;
        while (n != 0) {
            n = n / 10; // 563 / 10 = 56 , 56 / 10 = 5 , 5 / 10 = 0
            count++;
        }
        System.out.println(count);

    }
}
