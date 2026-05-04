package OOPS;

// Call Parent Constructor
// Used to initialize parent class

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // calls parent constructor
        System.out.println("Child constructor");
    }
}

public class Super3 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

// Parent constructor
// Child constructor
