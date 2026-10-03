package linkedlist;

public class LinkedListExercises {

    class Node {

        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    Node tail = null;

    public void addNodeAtEnd(int val) //O(1)
    {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }

    }

    public void deleteNodeEnd() //~ n
    {

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    //add node in the beginning
    public void addNodeatStart(int val) // O(1)
    {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addNodeAtIndex(int val, int index)// 30 29th O(n)
    {

        int count = 1;
        Node current = head;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        Node newNode = new Node(val);
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;


    }

    public void removeNodeAtAGivenIndex(int index) {
        int count = 1;
        Node current = head;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        //at this point we are at the previous index of the index where we want to delete node
        // point the next of current to the next of next to remove the connection with the next node
        current.next = current.next.next;
    }

    // _2-3-4
    public void deleteFirstNode() //O(1)
    {
        head = head.next;
    }


    public void printLinkedList(Node headNode) // O(n)
    {

        Node current = headNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    // 1<- 2-> 3
    public void reverseLinkedList() //O(n)
    {
        Node next = null;
        Node prev = null;
        Node curr = head;
        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        printLinkedList(prev);
    }


    public static void main(String[] args) {
        LinkedListExercises l = new LinkedListExercises();
        l.addNodeAtEnd(10);
        l.addNodeAtEnd(20);
        l.addNodeAtEnd(30);
        l.addNodeAtEnd(40);
        //  l.printLinkedList(head);
        l.addNodeAtIndex(75, 3);
//       l.removeNodeAtAGivenIndex(2);
        l.deleteNodeEnd();
        l.deleteFirstNode();
        l.printLinkedList(head);
        l.reverseLinkedList();
    }

}
