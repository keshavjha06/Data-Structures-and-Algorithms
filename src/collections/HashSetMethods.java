package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

// HashSet doesn't accept duplicates and doesn't store elements in order of insertion
// elements in hash table are accessed using hash codes(index of element in array)
// internally it uses hash map to store elements, where keys are elements and values are dummy values

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        System.out.println(hashSet); // [50, 20, 40, 10, 60, 30]
        System.out.println(hashSet.contains(10)); // true
        System.out.println(hashSet.contains(100)); // false
        hashSet.remove(10);
        System.out.println(hashSet); // [50, 20, 40, 60, 30]
        hashSet.remove(100);
        System.out.println(hashSet); // [50, 20, 40, 60, 30]
        hashSet.clear();
        System.out.println(hashSet); // []
        System.out.println(hashSet.isEmpty()); // true

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        // TreeSet<Integer> treeSet = new TreeSet<>(); - store elements in sorted order
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(60);
        System.out.println(linkedHashSet); // [10, 20, 30, 40, 50, 60] - order of insertion is preserved

        // HashedSet -> 0(1)
        // LinkedHashedSet -> 0(n)
        // TreeSet -> BST -> 0(logn)

    }

}
