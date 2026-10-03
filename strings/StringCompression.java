package strings;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaa bb zz t kk aa";
        s = s.replace(" ", "");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i));
                // if (count > 1) {  remove if block to print count of every character
                // sb.append(count);  a3b2z2tk2a2
                // }
                sb.append(count); // a3b2z2t1k2a2
                count = 1;
            }
        }
        System.out.println(sb.toString());

        // Another Approach
        String str = "aaa bb zz t kk aa";
        str = str.replace(" ", "");
        for (int i = 0; i < str.length(); i++) {
            int counter = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                counter++;
                i++;
            }
            System.out.print(str.charAt(i));
            System.out.print(counter);
        }
    }
}
