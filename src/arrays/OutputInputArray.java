package arrays;

import java.util.Scanner;

public class OutputInputArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {5 , -8, 2, 37, 43 , -97 , 22 , 34 , 56};
        // System.out.println(arr.length);
        // int n = arr.length; // index = 0 to n - 1
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }

        int[] karan = new int[7];
        // default values 0 0 0 0 0 0 0
        // for (int i = 0; i < 7; i++) {
        // System.out.print(karan[i] + " ");
        // }

        // input
        for (int i = 0; i < 7; i++) {
            karan[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(2 * karan[i] + " ");
        }

    }

}
