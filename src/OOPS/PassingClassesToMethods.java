package OOPS;

public class PassingClassesToMethods {
    public static class Car {
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print() {
            System.out.println(seats + " " + name + " " + length + " " + type + " " + torque);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.99;
        c.name = "Kia Sonnet";
        c.seats = 5;
        c.type = "SUV";
        c.torque = 100;

        change(c);

        System.out.println(c.seats);

        c.print();

    }

    private static void change(Car x) {
        x.seats = 4;
    }
}
