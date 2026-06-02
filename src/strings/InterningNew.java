package strings;

public class InterningNew {
    public static void main(String[] args) {
        String s1 = "Keshav";
        String s2 = new String("Keshav");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = s2.intern();
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
    }

}
