package arrays;

public class SecondMaxValue {

    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE; // -2147483648
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) { // arr[i] != max - check for duplicate value
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 34, 2, 34, 33, 1 };
        // SecondMaxValue smv = new SecondMaxValue(); if funciton is not static
        // System.out.println(smv.findSecondMax(arr));
        System.out.print(findSecondMax(arr));
    }

}
