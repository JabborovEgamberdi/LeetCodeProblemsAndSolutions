// Done
public class Longest_Common_Prefix_14 {

    public static void main(String[] args) {
        String[] str = new String[]{"flower", "flow", "flight"};
        System.out.println(STR."longestCommonPrefix(str) = \{longestCommonPrefix1(str)}");
        String[] str2 = {"dog","racecar","car"};
        System.out.println(STR."longestCommonPrefix(str2) = \{longestCommonPrefix1(str2)}");
        String[] str3 = new String[]{"ab", "a"};
        System.out.println(STR."longestCommonPrefix(strs3) = \{longestCommonPrefix1(str3)}");
    }

    // passed 96%+ test cases
    public static String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        String largest = strs[0];
        for (String str : strs) {
            if (smallest.compareTo(str) > 0) {
                largest = str;
            }
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
        }

        int i = 0;

        if (smallest.length() > largest.length()) {
            while (i < largest.length()) {
                if (smallest.charAt(i) == largest.charAt(i)) {
                    i++;
                } else
                    break;
            }
        } else {
            while (i < smallest.length()) {
                if (smallest.charAt(i) == largest.charAt(i)) {
                    i++;
                } else
                    break;
            }
        }

        return smallest.substring(0, i);

    }

    // work 1 ms
    public static String longestCommonPrefix1(String[] strs) {
        int length = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < length) {
                length = strs[i].length();
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int str = 0;
            while (str < strs.length) {
                if (result.length() < i + 1) {
                    result.append(strs[str].charAt(i));
                    str++;
                    continue;
                }
                if (strs[str].charAt(i) == result.charAt(i)) {
                    str++;
                } else {
                    result.deleteCharAt(i);
                    return result.toString();
                }
            }
        }
        return result.toString();
    }

}