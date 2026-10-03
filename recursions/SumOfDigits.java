package recursions;

public class SumOfDigits {

    static int[] arr = {12,2,30,13,5};
    public static void main(String[] args) {


       int value =  sumOfDigits(arr.length-1);
       System.out.println(value);
    }

    private static int sumOfDigits(int n) {
        if(n==0)
            return arr[n];
        return arr[n] + sumOfDigits(n-1);

    }
}
