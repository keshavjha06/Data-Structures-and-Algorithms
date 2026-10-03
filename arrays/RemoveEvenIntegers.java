package arrays;

public class RemoveEvenIntegers {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }

        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {3, 2,  4,  7 , 10 ,  6,  5}; // 3 , 7 , 5
        printArray(arr);
//       int[] result = removeEven(arr);
//        printArray(result);
        printArray(removeEven(arr));
    }


}
