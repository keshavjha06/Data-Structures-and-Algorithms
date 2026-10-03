package strings;

public class ChangeTheString {
    public static void main(String[] args) {
        String s = "TbCD";
        String str = "";
        if (s.length() > 0) {
            char firstChar = s.charAt(0);
            if (Character.isUpperCase(firstChar)) {
                str = s.toUpperCase();
            } else {
                str = s.toLowerCase();
            }
        }
        System.out.println(str);

    }

}
