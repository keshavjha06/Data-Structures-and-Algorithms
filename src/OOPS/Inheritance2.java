package OOPS;

//Method Overriding (Runtime Polymorphism)
//Subclass provides its own implementation of parent method.
//JVM decides at runtime which method to call → runtime polymorphism

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Lion extends Animal {
    void sound() {
        System.out.println("Lion Roars");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Animal a = new Dog(); // parent reference, child object
        Animal b = new Lion();
        a.sound();
        b.sound();
    }
}