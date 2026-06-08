package sorting;

import java.util.Arrays;

public class BubbleSortDescending {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 0, 11, 9, 2 };
        bubbleSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;

        }
    }
}
