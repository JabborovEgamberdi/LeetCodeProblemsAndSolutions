import java.util.HashSet;
import java.util.Set;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Runtime: 0 ms, faster than 100.00% of Java online submissions for Substrings of Size Three with Distinct Characters.
* TimeComplexity: O(n)
* */
public class N_1876 {
    public static void main(String[] args) {
        System.out.println(countGoodSubstrings1("xyzzaz"));
        System.out.println(countGoodSubstrings1("aababcabc"));
        System.out.println(countGoodSubstrings2("xyzzaz"));
        System.out.println(countGoodSubstrings2("aababcabc"));
    }

    // 2 ms
    private static int countGoodSubstrings1(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            String string = s.substring(i, i + 3);
            boolean b = containsDuplicates(string);
            if (b) count++;
        }
        return count;
    }

    private static boolean containsDuplicates(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size() == s.length();
    }


    // 0 ms
    public static int countGoodSubstrings2(String s) {
        int count = 0;
        char[] characters = s.toCharArray();
        for (int i = 1; i < characters.length - 1; i++) {
            if (characters[i - 1] != characters[i] && characters[i] != characters[i + 1] && characters[i - 1] != characters[i + 1]) {
                count += 1;
            }
        }
        return count;
    }
}
