package recursions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        int fact_value = factorial(5);
//        System.out.println(fact_value);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Error");
        } else {
            System.out.println(factorial(n));
        }

    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        int partialAns = factorial(n-1);
        return n * partialAns;
        // or return n * factorial(n - 1);

    }

}
