package Recursions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

    }

    static int fibo(int n) {
        if (n == 1 || n == 2)
            return 1;
        int partialAns1 = fibo(n - 1);
        int partialAns2 = fibo(n - 2);
        return partialAns1 + partialAns2;

    }
}
