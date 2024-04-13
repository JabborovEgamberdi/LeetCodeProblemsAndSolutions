package NotFinished;

import java.util.Stack;

public class N_1544 {
    public static void main(String[] args) {
        String s = "leEeetcode";
        System.out.println(makeGood(s));
    }

    public static String makeGood2(String s) {
        int i = 0;
        while (i < s.length() - 1) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                s = s.substring(0, i) + s.substring(i + 2);
                if (i > 0) i--;
            } else i++;
        }
        return s;
    }

    public static String makeGood(String s) {
        Stack<Character> str = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c < 91) {
                if (!str.isEmpty()) str.pop();
            } else str.push(c);
        }
        if (str.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        for (char ch : str) {
            result.append(ch);
        }
        return result.toString();
    }
}
