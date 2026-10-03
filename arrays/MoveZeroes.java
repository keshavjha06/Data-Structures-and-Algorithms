package arrays;

public class MoveZeroes {

    // Move Zeroes to end of an array

    // {0 , 1, 0 , 4, 12} - Ans {1 , 4 , 12, 0 , 0}

    public static void moveZeros(int[] arr, int n) {
        int j = 0; // focus on zeroth elements
        for (int i = 0; i < n ; i++) { // i will focus on non zero elements
            if(arr[i]!=0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0) {
                j++;
            }

        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] arr = {0, 1, 0, 2, 1, 0, 4, 12};
        printArray(arr);
        moveZeros(arr, arr.length);
        printArray(arr);
    }


    public static void main(String[] args) {
       MoveZeroes arrUtil = new MoveZeroes();
        arrUtil.arrayDemo();
    }

}


