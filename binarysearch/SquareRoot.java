package binarysearch;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(floorSqrt(11));

    }

    static int floorSqrt(int n) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid > n)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return high;

    }
}
