package OOPS;

public class ThisKeyword {
    public static class Car {
        int price; // 0
        String name; // null
        Car() { // default constructor
        }
        Car(int price, String name) {
            this.price = price;
            this.name = name;
        }

        Car(String s, int x) {
            price = x;
            name = s;
        }
        void print() {
            int price = 12; // prints 12 for price but when this.price is added then prints price in the object (1250000 , 400000)
            System.out.println(this.price+" "+name); // this.price
        }

    }

    static void main(String[] args) {
        Car c1 = new Car(1250000, "Kia Sonnet");
        c1.print();
        Car c2 = new Car( "Lord Altos", 400000 );
        c2.print();
        Car c3 = new Car();
        c3.name = "Honda Amaze";

    }


}