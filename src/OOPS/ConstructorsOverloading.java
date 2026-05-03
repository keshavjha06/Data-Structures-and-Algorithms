package OOPS;

public class ConstructorsOverloading {
    public static class Car {
        int price; // 0
        String name; // null
        Car() { // default constructor
        }
        Car(int x, String s) {
            price = x;
            name = s;
        }

        Car(String s, int x) {
            price = x;
            name = s;
        }
        void print() {
            System.out.println(price+" "+name);
        }

    }

    static void main(String[] args) {
        Car c1 = new Car(1250000, "Kia");
        c1.print();
        Car c2 = new Car( "Altos", 400000 );
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";

    }


}