package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] nums = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(nums);

    }

    public static void setZeroes(int[][] matrix) {

        ArrayList<Integer> rowCoords = new ArrayList<>();
        ArrayList<Integer> colCoords = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowCoords.add(i);
                    colCoords.add(j);
                }
            }
        }

        for (int i = 0; i < rowCoords.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rowCoords.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < colCoords.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][colCoords.get(i)] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
