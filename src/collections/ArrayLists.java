package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// list is an interface. ArrayList , LinkedList, Vector are the implementations

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(12);
        arr.add(2);
        arr.add(89);
        arr.add(9);
        System.out.println(arr.get(2)); // arr[2]
        arr.set(3, 50); // arr[3] = 50
        System.out.println(arr); // not traversing the array by ourselves

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        // 25 12 2 50 9
        arr.add(78); // 25 12 2 50 9 78
        arr.add(1, 100);
        System.out.println(arr); // 25 100 12 2 50 9 78
        arr.remove(arr.size() - 1);
        System.out.println(arr);

        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

        // Collections.reverse(arr);
        System.out.println(arr);
        ArrayList<Character> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(400);
        list2.add(500);
        list2.add(600);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2: " + list2);
        list2.clear();
        System.out.println(list2.size());

        // traverse list using iterator

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(2));
        System.out.println("Before Set " + list3);
        list3.set(0, 100);
        System.out.println("After Set " + list3);

        // toArray
        Object[] array = list3.toArray();
        for (Object obj : array) {
            System.out.println(obj + " ");
        }

        // contains
        System.out.println(list3.contains(100)); // true

        list.add(12);
        list.add(6);
        System.out.println("Printing Entire list " + list);

        // sort an arrayList
        Collections.sort(list);
        System.out.println("After sorting ascending " + list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println("After sorting descending " + list);

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println("Printing Entire newList: " + newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty()); // true

        System.out.println(newList.indexOf(100)); // index of element 100 - 2

    }

}
