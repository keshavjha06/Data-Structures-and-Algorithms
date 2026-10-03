package patterns;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}

/*
   1 2 3 4 5
1  1                i + j =  even ( 1 + 1 , 2 + 2 , 3 + 1 , 3 + 3 , 4 + 2 , 4 + 4 , 5 + 1 , 5 + 3 , 5 + 5) positions
2  0 1              
3  1 0 1            
4  0 1 0 1          
5  1 0 1 0 1        
*/