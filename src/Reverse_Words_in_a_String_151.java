import java.util.ArrayList;
/*
    Level: MEDIUM

    Result:
  Successfully finished with runtime 0 ms

    Time Complexity:
       first way: O (n + m);
                     n - length of input string;
                     m - length of trimmed string;
       second way: O (1)

*/
// not finished
public class Reverse_Words_in_a_String_151 {
    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(reverseWords(s));

        String s1 = "  hello world  ";
        System.out.println(reverseWords(s1));

        String s2 = "a good   example";
        System.out.println(reverseWords(s2));

    }

    public static String reverseWords(String s) {
        ArrayList<StringBuilder> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        boolean isPresent = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                isPresent = true;
            }

            if (isPresent) {
                word.append(s.charAt(i));
            }

            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                if (i == s.length() - 1) {
                    word.append(" ");
                }
                words.add(word);
                word = new StringBuilder();
                isPresent = false;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            result.append(words.get(i));
        }

        return result.toString().trim();
    }

}