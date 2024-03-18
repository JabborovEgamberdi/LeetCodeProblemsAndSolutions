import java.util.HashSet;
import java.util.Set;
/*
* Status: DONE
* Level: 🟡🟡🟡
*/
public class N_3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println(lengthOfLongestSubstring1("abba"));
    }

    // 88 ms ---> worse case
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.length() == 1) return 1;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            boolean isAdded = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (isAdded) {
                    set.add(s.charAt(i));
                    isAdded = false;
                }
                if (!set.add(s.charAt(j))) {
                    max = Math.max(max, set.size());
                    set = new HashSet<>();
                    break;
                }
                if (j == s.length() - 1) {
                    max = Math.max(max, set.size());
                    set = new HashSet<>();
                }
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                int index = i--;
                int count = 0;
                while (index > 0) {
                    if (set.add(s.charAt(index))) {
                        count++;
                        index--;
                    } else break;
                }
                if (set.size() + count > max) {
                    max = set.size() + count;
                }
                set = new HashSet<>();
                set.add(s.charAt(i));
            } else set.add(s.charAt(i));
        }
        return Math.max(max, set.size());
    }


}