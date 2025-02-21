package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayBasics {

    public static void main(String[] args) {
        int[] a  = new int[] {1, 2, 3 ,5};
        int[] b = new int[4];
        System.out.println(a[0]);
        System.out.println(a[a.length]);
        System.out.println(a[k]);
        a[0] = 6;
        int n = a.length;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            System.out.println(a[i]);
            a[i] = i+1;
            list.add(a[i]);
        }

        for (int i:a) {
            System.out.println(a[i]);
        }

        int i=0;
        while(i<n) {
            System.out.println(a[i]);
            i=i+1;
        }

        Integer[] c = new Integer[] {1, 2, 3};
        List<Integer> list1 = Arrays.stream().boxed().collect(Collectors.toList());
        Collectors.toList();

        Arrays.asList(a);

        int[] arr  = new int[] {1, 2, 3 ,5 , 7};
        int[] arr1 = Arrays.copyOf(arr , 10);

        Arrays.fill(a , 1);
        Arrays.sort(a);
        Arrays.binarySearch(a , 4); // -3

        char[] ch = new char[] {'a' , 'b' , 'c'};
        String string = new String(ch); //abc
        
        int[][] arr2 = new int[3][4];
        for (int j = 0; j <=n ; j++) {
            for (int k = 0; j <= m ; j++) {
                arr2[j][k] = i+j; // AIOBE
            }
        }

        int[][] arr3 = new int[][] {
                {1, 2, 3} ,
                {4, 5 ,6} ,
                {7,8,9}
        };




    }




}
