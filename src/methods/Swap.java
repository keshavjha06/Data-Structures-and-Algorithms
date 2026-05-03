package methods;

import java.util.Scanner;

public class Swap {

    public static void swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
       /* a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b); // 20 10 ✅*/
//        int a = 10; int b = 20;
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
       swap(a,b);

    }
}
