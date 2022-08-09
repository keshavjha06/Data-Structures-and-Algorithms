package arrays;

import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {

        // int[] n = {7, 1, 5, 3, 6, 4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Elements : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;

    }


}
