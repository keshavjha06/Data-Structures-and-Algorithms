package methods;

public class Arguments {

       static int max(int a , int b , int c ) {  // parameters
//        if(a >= b && a >= c) System.out.println(a);
//        else if(b >= a && b >= c) System.out.println(b);
//        else System.out.println(c);

        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        else return c;


    }
    static void main(String[] args) {
//        sum(5,8 , 9); //arguments
        System.out.println(max(4,2,9));

    }
}
