package OOPS;

// Call Parent Class Method
// When method is overridden, use super to call parent version

class Parent {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child method");
    }

    void display() {
        show(); // child method
        super.show(); // parent method
    }
}

public class Super2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
// Child method, Parent method