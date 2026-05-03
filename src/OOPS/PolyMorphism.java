package OOPS;

public class PolyMorphism {
    public static class Dog {
        void speak() {
            System.out.println("Bhau Bhau");
        }

    }

    public static class Cat {
        void speak() {
            System.out.println("Meow Meow");
        }

    }

    public static class Lion {
        void speak() {
            System.out.println("GRRRRRR");
        }

    }

    public static class Pikachu {
        void speak() {
            System.out.println("Pika Pika");
        }

    }

    public static class Human {
        void speak() {
            System.out.println("Hello");
        }

    }

    public static void main(String[] args) {
        Human h = new Human();
        Cat c = new Cat();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Lion l = new Lion();

        d.speak();
        l.speak();
        h.speak();
        c.speak();
        p.speak();
        System.out.println(max(4, 5, 6));


    }

    // Method overloading / Compile Time polymorphism

    public static int  max(int a, int b) {
        return Math.max(a, b);
    }

    public static int  max(int a, int b , int c) {
        return Math.max(a, Math.max(b, c));
    }
}
