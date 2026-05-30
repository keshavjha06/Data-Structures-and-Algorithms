package collections;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.addFirst(10);
        ll.addLast(20);
        ll.add(1, 30);
        System.out.println(ll); // [10, 30, 40, 50, 60, 20]
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); // [30, 40, 50, 60]

        System.out.println(ll.getFirst()); // 30
        System.out.println(ll.getLast()); // 60

        System.out.println(ll.peek()); // 30
        System.out.println(ll);
        System.out.println(ll.poll()); // 30
        System.out.println(ll); // [40, 50, 60]
        System.out.println(ll.offer(100)); // true
        System.out.println(ll); // [40, 50, 60, 100]

    }

}
