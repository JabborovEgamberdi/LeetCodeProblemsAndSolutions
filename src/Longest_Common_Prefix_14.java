public class Longest_Common_Prefix_14 {

    public static void main(String[] args) {
        String[] str = new String[]{"flower", "flow", "flight"};
        System.out.println("longestCommonPrefix(str) = " + longestCommonPrefix(str));
        String[] str2 = {"dog","racecar","car"};
        System.out.println("longestCommonPrefix(str2) = " + longestCommonPrefix(str2));
        String[] str3 = new String[]{"ab", "a"};
        System.out.println("longestCommonPrefix(strs3) = " + longestCommonPrefix(str3));
    }

    public static String longestCommonPrefix(String[] strs) {
        String smallest = strs[0];
        String largest = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (smallest.compareTo(strs[i]) > 0) {
                largest = strs[i];
            }
            if (largest.compareTo(strs[i]) < 0) {
                largest = strs[i];
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

}