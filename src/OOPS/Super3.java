package OOPS;

// Call Parent Constructor
// Used to initialize parent class

class Parentss {
    Parentss() {
        System.out.println("Parent constructor");
    }
}

class Childss extends Parentss {
    Childss() {
        super(); // calls parent constructor
        System.out.println("Child constructor");
    }
}

public class Super3 {
    public static void main(String[] args) {
        Childss c = new Childss();
    }
}

// Parent constructor
// Child constructor
