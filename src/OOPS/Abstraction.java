package OOPS;

//Abstraction = hiding implementation details and showing only essential features.
// In Java, you achieve abstraction using: Abstract classes & Interfaces
//An abstract class can have: Abstract methods (no body) , Concrete methods (with body)

//You don’t know how start works internally → that’s abstraction.

abstract class Vehicle {
    abstract void start(); // abstract method

    void fuelType() {
        System.out.println("Petrol/Diesel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.fuelType();
    }
}