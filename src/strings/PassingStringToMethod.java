package strings;

public class PassingStringToMethod {
    public static void main(String[] args) {
        String str = "Keshav";
        System.out.println(str);
        change(str); // it will not change the value of String , String is pass by value
        System.out.println(str);

    }

    static void change(String str) {
        str = "Utkarsh";
    }

}
