package loops;

import java.util.Scanner;

public class printtable {
    public static void main(String[] args) {
       /* for (int i = 17; i <  170; i = i + 17) {
            System.out.print(i + " ");

        }*/

      /*  for (int i = 1; i < 10; i++) {
            System.out.print(i * 17 + " ");

        }
       */

      /*  print numbers divisible by 3 and are odd
      for (int i = 1; i < 100; i++) {
           if(i % 3 == 0 && i % 2 != 0) System.out.print(i + " ");

        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);

        }
    }
}
