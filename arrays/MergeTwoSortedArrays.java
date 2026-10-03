package arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = { 2, 5, 6, 9, 20 };
        int[] b = { 1, 3, 4, 5, 7, 8 };

        int[] c = new int[a.length + b.length];
        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();
        merge(c, a, b);
        int i = 0, j = 0, k = 0;
        for (int ele : c)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void merge(int[] c, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
                // or c[k++] = a[i++];
            } else {
                c[k] = b[j];
                j++;
                k++;
                // or c[k++] = b[j++];
            }
        }
        while (i < a.length) { // b array is finished -> take remaining elements of a
            c[k++] = a[i++];

        }
        while (j < b.length) { // a array is finished -> take remaining elements of b
            c[k++] = b[j++];
        }

    }
}
