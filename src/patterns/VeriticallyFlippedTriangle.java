package patterns;

import java.util.Scanner;

public class VeriticallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
        // Alternate Approach
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                   System.out.print("* ");
                // System.out.print(j+ " ");
                // System.out.print((char)(i+64)+ " ");
            }
            System.out.println();
        }
    }

}

/*
        *       
      * * 
    * * * 
  * * * * 
* * * * * 

        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 

        A 
      B B 
    C C C 
  D D D D 
E E E E E  */