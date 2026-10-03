package patterns;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //  System.out.print(" * "+ " ");
                //  System.out.print(j + " ");
                //  System.out.print(i + " ");
                //  System.out.print((char)(j + 64) + " ");
                    System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }
}

/* 
 *  
 *   *  
 *   *   *  
 *   *   *   *  
 *   *   *   *   *   
  

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5

A 
A B 
A B C 
A B C D 
A B C D E 

A 
B B 
C C C 
D D D D 
E E E E E */