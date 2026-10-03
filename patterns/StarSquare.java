package patterns;

import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // System.out.print("* ");
                // System.out.print(j + " ");
                 System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
1 1 1 1 1        
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 

1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * *  */