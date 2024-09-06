import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟡🟡🟡
* Status: DONE
* */
void main() {
    System.out.println(longestPalindrome("babad"));
    System.out.println(longestPalindrome("cbbd"));
    System.out.println(longestPalindrome("a"));
    System.out.println(longestPalindrome("ac"));
    System.out.println(longestPalindrome("bb"));
    System.out.println(longestPalindrome("ccc"));
    System.out.println(longestPalindrome("bab"));
    System.out.println(longestPalindrome("babab"));
}

public String longestPalindrome(String s) {
    String longestPalindrome = "";
    List<Character> isUsed = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
        if (isUsed.contains(s.charAt(i))) {
            continue;
        }
        for (int j = i; j < s.length(); j++) {
            if (s.charAt(i) == (s.charAt(j))) {
                String str = s.substring(i, j + 1);
                boolean isPalindrome = isPalindrome(i, j, longestPalindrome.length() - 1, s);
                if (isPalindrome) {
                    longestPalindrome = str;
                }
            }
        }
        isUsed.add(s.charAt(i));
    }
    return longestPalindrome.isEmpty() ? s.substring(0, 1) : longestPalindrome;
}

private boolean isPalindrome(int beginIndex, int lastIndex, int res, String s) {
    int size = lastIndex - beginIndex;
    if (res >= size) {
        return false;
    }
    while (beginIndex <= lastIndex) {
        if (s.charAt(beginIndex) != (s.charAt(lastIndex))) {
            return false;
        }
        beginIndex++;
        lastIndex--;
    }
    return true;
}

public static String longestPalindrome1(String s) {
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