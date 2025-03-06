package arrays;

public class MissingNumber {


    public int missingNum(int[] arr) {
        int n = arr.length+ 1;
        int sum = n * (n + 1)/2;
        /*for(int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }*/
        for(int num : arr) {
            sum = sum - num;
    }
    return sum;
}


    public static void main(String[] args) {
        int[] arr = {2, 4 ,  1 ,  8, 6, 3, 7};
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNum(arr));
    }
}
