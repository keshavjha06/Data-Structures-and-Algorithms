package arrays;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        // double[] arr = new double[10];
        char ch = '\0';
        System.out.println((int) ch);
        char[] arr = new char[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        String[] array = { "Abhinav", "Harsh", "Achyut", "Sahil", "Isha" };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
