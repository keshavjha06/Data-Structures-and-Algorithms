package arrays;

public class SegregateZerosOnesAndTwos {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 2, 2, 2, 1, 0 };

        int numberOfZeros = 0;
        int numberOfOnes = 0;
        for (int ele : arr) {
            if (ele == 0) {
                numberOfZeros++;
            } else if (ele == 1) {
                numberOfOnes++;
            }
        }
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }
        for (int i = numberOfZeros; i < numberOfZeros + numberOfOnes; i++) {
            arr[i] = 1;
        }
        for (int i = numberOfZeros + numberOfOnes; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
