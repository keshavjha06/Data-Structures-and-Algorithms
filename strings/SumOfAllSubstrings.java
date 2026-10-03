package strings;

public class SumOfAllSubstrings {
    public static void main(String[] args) {
        String s = "6759";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                sum = sum + Integer.parseInt(s.substring(i, j + 1));
            }
        }
        System.out.println(sum);
    }

}
