package strings;

public class DynamicFizzBuzz {

    public static void main(String[] args) {
        String input = "3:fizz 5:buzz 1";
        // String input = "3:fizz 7:buzz 9:whizz 315";
        System.out.println(getOutput(input));
    }

    public static String getOutput(String str) {

        String[] tokens = str.split("\\s+");
        int number = Integer.parseInt(tokens[tokens.length - 1]);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < tokens.length - 1; i++) {
            String[] pair = tokens[i].split(":");
            int divisor = Integer.parseInt(pair[0]);
            String word = pair[1];
            if (number % divisor == 0) {
                result.append(word);
            }
        }

        return result.length() > 0 ? result.toString() : String.valueOf(number);
    }
}