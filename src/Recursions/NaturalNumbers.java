package Recursions;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));


    }
    static int sum(int n){
        if(n == 1)
        return 1;
        int partialAns = sum(n-1);
        return n + partialAns;
    }
}
