package binarysearch;

import java.util.ArrayList;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9 };
        System.out.println(binarySearch(arr, 5));
    }

    public static ArrayList<Integer> binarySearch(int[] arr, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        // first occurence
        int low = 0, high = arr.length - 1, idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                idx = mid;
                high = mid - 1;
            }
        }
        ans.add(idx);
        // last occurence
        low = 0;
        high = arr.length - 1;
        idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < x) {
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                idx = mid;
                low = mid + 1;
            }
        }
        ans.add(idx);
        return ans;
    }

}
