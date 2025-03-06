package arrays;

public class ResizeArray {

    public void printArray(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public int[] resize(int[] arr , int capacity) {
        int[] temp = new int[capacity] ;
        for (int i = 0; i < arr.length; i++) {
             temp[i] = arr[i]; // assign the value stored at ith index of original array to temp array at ith index
        }
        return temp;

    }


    public static void main(String[] args) {
        ResizeArray ra = new ResizeArray();
//        ra.printArray(new int[] {5, 1, 2, 9, 10});
        int[] original = new int[] {5, 1, 2, 9, 10};
        System.out.println("The size of original array is " + original.length);
        original = ra.resize(original , 10);
        System.out.println("The size of original array after resize is " + original.length);


    }
}
