package binarysearch;

public class DescendingSortedArray {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(binarySearch(arr, 5));
    }

    public static int binarySearch(int[] arr, int tar) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < tar) {
                high = mid - 1;
            } else if (arr[mid] > tar) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    
}
