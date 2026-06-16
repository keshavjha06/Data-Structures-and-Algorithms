package binarysearch;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(binarySearch(arr, 40));
    }

    public static int binarySearch(int[] arr, int target) {
        int n = arr.length - 1;
        int low = 0, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] > target)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

}
