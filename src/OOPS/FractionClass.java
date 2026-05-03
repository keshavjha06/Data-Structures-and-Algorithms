package OOPS;

class Fraction {
    int num;
    int denom;

    Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
        simplify();
    }

    void print() {
        System.out.println(num + "/" + denom);
    }

    void add(Fraction f) {
        num = num * f.denom + denom * f.num;
        denom = denom * f.denom;
        simplify();
    }

    void multiply(Fraction f) {
        num = num * f.num;
        denom = denom * f.denom;
        simplify();
    }

    void divide(Fraction f) {
        num = num * f.denom;
        denom = denom * f.num;
        simplify();
    }

    void simplify() {
        boolean isNegative = (num * denom < 0) ? true : false;
        num = Math.abs(num);
        denom = Math.abs(denom);
        int gcd = hcf(num, denom);
        num = num / gcd;
        denom = denom / gcd;
        if (isNegative)
            num = -num;
    }

    int hcf(int a, int b) {
        if (a == 0)
            return b;
        return hcf(b % a, a);
    }
}

public class FractionClass {
    static void main(String[] args) {
        Fraction f1 = new Fraction(3, -7);
        // f1.print();
        Fraction f2 = new Fraction(7, 3);
        // f1.add(f2);
        // f1.print();
        f1.multiply(f2);
        f1.print();
        // f1.divide(f2);
        // f1.print();
        Fraction f3 = new Fraction(-50, -100);
        f3.print();

    }
}
