package arrays;

public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 0, 1 };
        
         /*  int numberOfZeros = 0;
        for (int ele : arr) {
            if (ele == 0) {
                numberOfZeros++;
            }
        }
        for (int i = 0; i < numberOfZeros; i++) {
            arr[i] = 0;
        }
        for (int i = numberOfZeros; i < arr.length; i++) {
            arr[i] = 1;
        } */
        
        // Another approach
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            }
           else if (arr[j] == 1) {
                j--;
            } else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}