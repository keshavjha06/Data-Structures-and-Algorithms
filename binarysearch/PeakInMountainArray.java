package binarysearch;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    
}
