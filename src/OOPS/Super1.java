package OOPS;

// Access Parent Class Variable
// When parent and child have same variable name → use super

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
    }
}

public class Super1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
// 20 , 10