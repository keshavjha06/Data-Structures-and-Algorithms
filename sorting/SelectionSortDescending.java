package sorting;

import java.util.Arrays;

public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] arr = { 4 , 1 , 0 , -1 , 11 , 9 , 10};
        for (int i = 0; i < arr.length - 1; i++) {
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for(int j = i ; j < arr.length ; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
