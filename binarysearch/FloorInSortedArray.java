package binarysearch;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 10, 10, 12, 19 };
        System.out.println(findFloor(arr, 5));
    }

    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1 , idx = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            }
            else  {
                idx = mid;
                low = mid + 1;
            }
        }
        return idx;

    }

}
