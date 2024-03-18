package NotFinished;

public class N_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new N_557().reverseWords(s));
    }

    public StringBuilder result = new StringBuilder();

    public String reverseWords(String s) {
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                result(start, i, s);
                start = i + 1;
            }
            if (i == s.length() - 1) {
                result(start, i + 1, s);
            }
        }
        return result.toString();
    }

    private void result(int start, int index, String s) {
        String word = s.substring(start, index);
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        if (index != s.length()) result.append(" ");
    }
}
