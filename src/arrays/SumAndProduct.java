package arrays;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        // sum of elements
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum is " + sum);
        // Product of elements
        int[] array = { 2, 3, 5, 6, 7 };
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            product = product * array[i];
        }
        System.out.println("The product is " + product);
    }
}
