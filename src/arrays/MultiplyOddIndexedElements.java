package arrays;

public class MultiplyOddIndexedElements {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                arr[i] = arr[i] * 2;
            else
                arr[i] = arr[i] + 10;
            System.out.print(arr[i] + " ");
        }
    }
}
