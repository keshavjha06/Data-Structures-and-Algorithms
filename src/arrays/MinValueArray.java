package arrays;

public class MinValueArray {

   public int findMinimum(int[] arr) {
       //edge
       if(arr == null || arr.length == 0) {
           throw new IllegalArgumentException("Invalid input");
       }
       int min = arr[0]; // min will hold the minimum of array
       for (int i = 1; i < arr.length; i++) {
           if( arr[i] < min) {
               min = arr[i];
           }
       }
       return min;

   }


    public static void main(String[] args) {
        int[] arr = {4, 9 , 3 , 1, 10, 15};
        MinValueArray ma = new MinValueArray();
        System.out.println(ma.findMinimum(arr));

    }
}

