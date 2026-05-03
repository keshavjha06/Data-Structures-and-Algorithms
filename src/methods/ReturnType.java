package methods;

public class ReturnType {
   public static int prasun(int a) {
        System.out.println("banu");
        if (a > 0) return 5;
        else return 10;
    }

    public static void main(String[] args) {
//        prasun(); standalone call
        int x= prasun(7);
//        System.out.println(3+(prasun()));
        System.out.println(3+x);

    }
}
