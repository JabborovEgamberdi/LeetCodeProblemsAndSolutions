package NotFinished;

import java.util.HashMap;

public class N_345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == 'a' || s.charAt(start) == 'e' || s.charAt(start) == 'i'
                    || s.charAt(start) == 'o' || s.charAt(start) == 'u') {
                if (s.charAt(end) == 'a' || s.charAt(end) == 'e' || s.charAt(end) == 'i'
                        || s.charAt(end) == 'o' || s.charAt(end) == 'u') {
                    char temp = s.charAt(start);
                    String replace = s.replace(s.charAt(start), s.charAt(end));
                    System.out.println(replace);
                    s = replace.replace(replace.charAt(end), temp);
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        return s;
    }
}
