package arrays;

public class ReverseArray {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 5 , 7, 8 , 10};
        printArray(numbers);
        reverse(numbers , 0  , numbers.length-1);
        printArray(numbers);
    }
}
