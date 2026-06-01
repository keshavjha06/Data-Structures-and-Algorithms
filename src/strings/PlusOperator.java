package strings;

public class PlusOperator {
    public static void main(String[] args) {
        String s = "keshav";
        s = s + " is a good boy";
        s += 10;
        s += 'a';
        s += '\n'; // moves to next line
        s += 'n';
        System.out.println(s);
        System.out.println("keshav" + 10 + 20); // keshav1020 (String + int = String)
        System.out.println(10 + 20 + "keshav"); // 30keshav
        System.out.println(10 + "keshav" + 20); // 10keshav20

    }

}
