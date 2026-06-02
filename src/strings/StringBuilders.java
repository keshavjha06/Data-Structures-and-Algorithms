package strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Keshav");
        System.out.println(sb.length() + "  " + sb.capacity()); // default capacity is 16
        System.out.println(sb);
        sb.append("Jha");
        System.out.println(sb);
        sb.setCharAt(1, 'o');
        System.out.println(sb);
        String t = sb.toString();
        System.out.println(t);
    }

}
