package arrays;

public class ArrayUtil {

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//       ArrayUtil arrayUtil = new ArrayUtil();
//      arrayUtil.printArray(new int[] {5 , 1 , 2, 9, 10});
        int[] myArray = {5 , 1, 2, 9, 10};
        printArray(myArray);
    }
}
