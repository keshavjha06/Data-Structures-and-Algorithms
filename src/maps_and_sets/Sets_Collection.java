package maps_and_sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets_Collection {
    public static void main(String[] args) {
        // TreeSet<Integer> set = new TreeSet<>(); // Balanced BST
        HashSet<Integer> set = new HashSet<>();
        set.add(77);
        set.add(65);
        set.add(21);
        set.add(2);
        set.add(11);
        set.add(45);
        set.add(3);
        for (int ele : set)
            System.out.print(ele + " ");
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains(45) + " " + set.contains(18));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
    }

}
