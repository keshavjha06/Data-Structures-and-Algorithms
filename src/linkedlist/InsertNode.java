package linkedlist;

public class InsertNode {

    private ListNode head;

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next; // Reference to next ListNode in list

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;

    }

    public void insert(int position , int value) {
         //   1 -> 4 -> 5
         //   1 -> 6 -> 4 -> 5
        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        }
        else {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }

    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        InsertNode sll = new InsertNode();
       /* sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.display();*/
       /* sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();*/
        sll.insert(1, 3); // 3 -> null
        sll.insert(2, 5); // 3 -> 5 -> null
        sll.insert(1, 2);// 2 -> 3 -> 5 -> null
        sll.insert(2, 4); // 2 -> 4 -> 3 -> 5 -> null
        sll.insert(5, 7); // 2 -> 4 -> 3 -> 5 -> 7 -> null
        sll.display();

    }

}
