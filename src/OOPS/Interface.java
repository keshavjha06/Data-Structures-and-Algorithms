package OOPS;

//Interface = 100% abstraction

interface Animals {
    void sound(); // abstract by default
}

class Cat implements Animals {
    public void sound() {
        System.out.println("Cat Meows");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animals a = new Cat();
        a.sound();
    }
}
