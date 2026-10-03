package strings;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        String s = "Keshav";
        StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        int i = 0, j = sb.length() - 1;
        while (i <= j) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;
        }
        System.out.println(sb); // vahseK
        sb.deleteCharAt(1); 
        System.out.println(sb); // vhseK
        sb.insert(1 , 'a');
        System.out.println(sb); // vahseK

        // Reverse string using string builder
        String str = "Aditya";
        StringBuilder sbr = new StringBuilder(str);
        sbr.reverse();
        str = sbr.toString();
        System.out.println(str); // aytidA
        
    }
    
}
