package OOPS;

class Arraylist {
    int[] arr;
    int index = 0;
    int size = 0;

    Arraylist(int capacity) {
        arr = new int[capacity];
    }

    void add(int ele) {
        if (index == arr.length) { // array is full
            capacityIncrease();
        }
        arr[index++] = ele;
        size++;
    }

    void removeFromEnd() {
        index--;
        size--;
    }

    int capacity() {
        return arr.length;
    }

    void capacityIncrease() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) { // copy paste
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    int get(int index) {
        return arr[index];
    }

    void set(int index, int val) {
        arr[index] = val;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class OwnArrayList {
    static void main(String[] args) {
        Arraylist arr = new Arraylist(8);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.display();
        System.out.println(arr.get(1));
        arr.add(40);
        arr.add(40);
        arr.add(40);
        arr.add(40);
        arr.add(40);
        arr.add(40);
        arr.display();

    }
}
