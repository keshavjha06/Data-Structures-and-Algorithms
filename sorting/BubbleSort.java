package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3 , 5 , 1 , 4 , 2 , 0};
        System.out.println("Arrays before Sorting " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Arrays after Sorting " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
     /*    for (int i = 0, j = 0; i < arr.length - 1; i++) { // n - 1 passes
            for (j = 0; j < arr.length - 1 - i; j++) { // last element is sorted so this loop will run 1 time less
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }*/

        // Bubble sort optimized
        for (int i = 0; i < arr.length - 1; i++) { // n - 1 passes
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) { // last element is sorted so this loop will run 1 time less
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) { // if no swap happened then array is sorted
                break;
            }
        }
    } 

}
