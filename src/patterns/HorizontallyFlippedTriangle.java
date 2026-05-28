package patterns;

import java.util.Scanner;

public class HorizontallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // for (int j = n; j >= i; j--) {
            for (int j = 1; j <= n + 1 - i; j++) { // i + jmax = n + 1
                //  System.out.print(" * " + " ");
                //  System.out.print(i + " ");
                //  System.out.print(j + " ");
                //  System.out.print((char)(j + 64) + " ");
                //  System.out.print((char)(i + 64) + " ");
                 System.out.print((char)(j + 96) + " ");
            }
            System.out.println();

        }
    }

}

/*
i + jmax = n + 1                   n = 4
i = 1 => jmax = 4                  *   *   *   *  
i = 2 => jmax = 3                  *   *   *  
i = 3 => jmax = 2                  *   *  
i = 4 => jmax = 1                  * 
*/

/* 
 *   *   *   *   *  
 *   *   *   *  
 *   *   *  
 *   *  
 *  

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

A B C D E 
A B C D 
A B C 
A B 
A 

A A A A A 
B B B B 
C C C 
D D 
E  */