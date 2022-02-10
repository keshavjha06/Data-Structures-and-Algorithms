package Arrays;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        // int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter the elements: ");
                arr[i][j] = scan.nextInt();
            }
        }
        rotateImage(arr);
    }

    //Transpose
    static void rotateImage(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                //swap matrix[i][j] with matrix [j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix.length / 2); j++) {
                //swap matrix[i][j] with matrix [i][n-j-1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
