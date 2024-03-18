import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class N_5 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("ac"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("bab"));
        System.out.println(longestPalindrome("babab"));
    }

    public static String longestPalindrome(String s) {

        List<Integer> list = new LinkedList<>();
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                if (start != end) {
                    list.add(start);
                    list.add(end);
                } else list.add(start);
            } else list = new LinkedList<>();
            start++;
            end--;
        }
        Collections.sort(list);

        StringBuilder result = new StringBuilder();
        for (Integer index : list) {
            result.append(s.charAt(index));
        }
        return result.toString();
    }
}
