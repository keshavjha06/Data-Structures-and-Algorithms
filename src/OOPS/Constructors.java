package OOPS;

public class Constructors {
    public static class Car {
        int seats; // 0
        String name; // null
        double length; // 0.0
        Car() { // default constructor
        }
        Car(int x, String s, double d) {
            seats = x;
            name = s;
            length = d;
        }
        void print() {
            System.out.println(seats+" "+name+" "+length);
        }

    }

    static void main(String[] args) {
        Car c1 = new Car(4, "Kia", 3.99);
        c1.print();
        Car c2 = new Car(5, "Altos" , 3.75);
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";

    }


}
