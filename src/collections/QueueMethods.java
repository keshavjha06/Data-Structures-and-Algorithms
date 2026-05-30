package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// for insertion use offer() , for removal use poll() , for accessing front element use peek() for avoiding exceptions
public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue); // [10, 20, 30, 40]
        System.out.println(queue.poll()); // 10
        System.out.println(queue); // [20, 30, 40]
        System.out.println(queue.peek()); // 20
        System.out.println(queue.isEmpty()); // false
        queue.clear();
        System.out.println(queue.isEmpty()); // true


        System.out.println("--------------------------------");

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offerFirst(20);
        deque.offerFirst(30);
        deque.offerFirst(40);
        System.out.println(deque); // [40, 30, 20, 10]
        System.out.println(deque.pollFirst()); // 40
        System.out.println(deque); // [30, 20, 10]
        System.out.println(deque.pollLast()); // 10
        System.out.println(deque); // [30, 20]
        System.out.println(deque.peekFirst()); // 30
        System.out.println(deque.peekLast()); // 20
        System.out.println(deque);
        System.out.println(deque.isEmpty()); // false
        deque.clear();
        System.out.println(deque.isEmpty()); // true

    }

}
