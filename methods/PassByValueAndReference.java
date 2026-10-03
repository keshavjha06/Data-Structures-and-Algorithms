package methods;

public class PassByValueAndReference {

    public static void change(int x){
        x = 10;
    }
     static void main(String[] args) {
        int x = 6;
        System.out.println(x); // 6
        change(x);
        System.out.println(x); // 6


    }
}
