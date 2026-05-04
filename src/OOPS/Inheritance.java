package OOPS;

//Method Overloading (Compile-Time Polymorphism)
//Same method name, different parameters , Happens at compile time

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(2, 3)); // 5
        System.out.println(c.add(2, 3, 4)); // 9
        System.out.println(c.add(2.5, 3.5)); // 6.0
    }
}
