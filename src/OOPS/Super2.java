package OOPS;

// Call Parent Class Method
// When method is overridden, use super to call parent version

class Parents {
    void show() {
        System.out.println("Parent method");
    }
}

class Childs extends Parents {
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
        Childs c = new Childs();
        c.display();
    }
}
// Child method, Parent method