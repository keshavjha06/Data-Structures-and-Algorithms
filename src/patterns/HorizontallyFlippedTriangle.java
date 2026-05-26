package patterns;

import java.util.Scanner;

public class HorizontallyFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) { // i + jmax = n + 1
                System.out.print(" * " + " ");
            }
            System.out.println();

        }
    }

}

/* i + jmax = n + 1 ,             n = 4
i = 1 => jmax = 4                 *   *   *   *  
i = 2 => jmax = 3                 *   *   *  
i = 3 => jmax = 2                 *   *  
i = 4 => jmax = 1                 * */
