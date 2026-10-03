package methods;

public class ReturnIsMandatory {
    static void main(String[] args) {
        System.out.println(num(3));
    }

    static int num(int a) {
        if(a < 5) {
            return a;
        }
        return -9;
    }
}
