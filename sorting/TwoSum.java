package sorting;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = { 7, 11, 2, 5, 4, 6 };
        int target = 7;
        System.out.println(twoSum(arr, target));
    }

    static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target)
                return true;
            else if (arr[i] + arr[j] > target)
                j--;
            else if (arr[i] + arr[j] < target)
                i++;
        }
        return false;
    }
}
