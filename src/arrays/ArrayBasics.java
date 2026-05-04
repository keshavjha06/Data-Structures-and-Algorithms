package arrays;

public class ArrayBasics {

    public static void main(String[] args) {
        int[] x = { 6, 34, 22, 11, 4, 9 };
        // indexing
        System.out.println(x[5]); // access
        // updating elements - mutability
        x[3] = 89;
        System.out.println(x[3]);
        int[] arr = new int[4]; // array of 4 size | 0 to 3
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = -4;

    }

}
