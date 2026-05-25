package loops;

import java.util.Scanner;

public class arithmeticprogression {
    // 2, 5, 8,1 1.....n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n = sc.nextInt();
       /* for(int i = 2; i <= 3 * n - 1; i = i + 3) {
            System.out.print(i + " ");
        }*/
        System.out.println("Enter First term");
        int a = sc.nextInt();
        System.out.println("Enter common difference");
        int d = sc.nextInt();
//        int a = 4, d = 6;
        for(int i = 1; i <= n ; i++) {
            System.out.print(a+ " ");
            a = a + d;
        }
    }
}
