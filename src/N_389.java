/*
* Time Complexity: O (n)
* Status: 🟢🟢🟢
* Level: Easy
* Runtime: 0 ms --> 100%
* */
public class N_389 {
    public static void main(String[] args) {
        findTheDifference("abcd", "abcde");
        findTheDifference2("abcd", "abcde");
    }

    public static char findTheDifference(String s, String t) {
        if (s.isEmpty()) return t.charAt(0);
        if (t.isEmpty()) return s.charAt(0);
        int length = 0;
        if (s.length() > t.length()) {
            length = s.length();
        } else if (s.length() < t.length()) {
            length = t.length();
        } else length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return t.charAt(i);
            }
        }
        return t.charAt(length);
    }

    public static char findTheDifference2(String s, String t) {
        int sSum = 0;
        int tSum = 0;
        for (char ss : s.toCharArray()) {
            sSum += ss;
        }
        for (char tt : t.toCharArray()) {
            tSum += tt;
        }
        return (char) (tSum - sSum);
    }
}