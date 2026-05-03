package OOPS;

class ComplexNumber {
    int x;
    int y;

    ComplexNumber(int x, int y) {
        this.x = x;
        this.y = y;
    }

    ComplexNumber() {
    }

    void print() {
        if (y >= 0)
            System.out.println(x + " + " + y + "i");
        else
            System.out.println(x + " - " + (-y) + "i");
    }

    public void add(ComplexNumber z) {
        x = x + z.x;
        y = y + z.y;
    }

    public void multiply(ComplexNumber z) {
        int newX = x * z.x - y * z.y; // ✅ temp variable
        int newY = x * z.y + y * z.x;
        x = newX;
        y = newY;
    }

    void divide(ComplexNumber z) {
        int denom = z.x * z.x + z.y * z.y; // ✅ correct formula
        int newX = (x * z.x + y * z.y) / denom;
        int newY = (y * z.x - x * z.y) / denom;
        x = newX;
        y = newY;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(3, 4);
        z1.print();
        z2.print();
        z1.add(z2);
        z1.print();
        z2.print();
        z2.multiply(z1);
        z1.print();
        z2.print();
        z2.divide(z1);
        z1.print();
        z2.print();
    }
}
