package Recursions;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(pow(x, n));

    }

    static long pow(int x, int n){
        if(n == 0)
            return 1;
        long partialAns = pow(x, n-1);
        return x * partialAns;

    }

   /* static long pow(int x, int n) {
        if (n == 0)
            return 1;
        long temp = pow(x, n / 2);
        if (n % 2 == 1)
            return temp * temp * x;
        return temp * temp;

    }*/
}
