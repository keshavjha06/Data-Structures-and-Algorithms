package strings;

public class StringBasics {
    public static void main(String[] args) {
        String s = "abc"; // immutable
        String s2 = "abc";
        String s1 = "abc" + "d";
        StringBuilder sbr = new StringBuilder("abc"); //fast
        StringBuffer sb = new StringBuffer("abc"); //thread safe , slow
        sb.append("a"); //abca
        sb.insert(1 , "b");
        sb.reverse();

        StringBuilder sb1 = new StringBuilder(s);
        String sb2 = new String(sb);



        String s4 = new String(sb);

        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc");

//        s == s2; //primitive or string literals
        s1.equals(str1); //true

        s1.length(); //3
        int len = s1.length();
        for (int i = 0; i <len ; i++) {
            char c = s1.charAt(i) ;// "a" //a, b, c
            System.out.println(c);
        }

        char [] chars = s1.toCharArray();
        String str3 = new String(chars);

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        for(char c: chars) {
           // System.out.print(char[i])
        }
        String b = "I am practicing GFG";
        b.split("\\s+");
        b.replace(" ",""); //Iampracti.....
        b.replaceAll("pract",""); //Iampra...
        b.replaceAll("\\s+" ,""); //IampracticingGFG
        b.replaceFirst(" ","") ; // Iam practicing GFG;
        String[] c = "I am practicing GFG".split(" ");
        String[] str4 = "I am practicing".split(" ");
        String str5 = String.join("-", str4); //I-am-Practicing

        String d = "abc";
        char e = s.charAt(0); //a
        char f = (char)65; //A

     //   ASCII -> A to Z -> 65 to 90 // a-z 97 - 122

        Character.isAlphabetic('a'); // true
        Character.isDigit('1'); //true
        Character.isUpperCase('b'); //false

        String g = "123";
        int a = Integer.parseInt(s); //123

        int h = 12;
        String i = a + ""; String.valueOf(h);


    }
}
