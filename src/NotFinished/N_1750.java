package NotFinished;

public class N_1750 {
    public static void main(String[] args) {
        String s = "ca";
        System.out.println(minimumLength(s));
        s = "cabaabac";
        System.out.println(minimumLength(s));
        s = "aabccabba";
        System.out.println(minimumLength(s));
        s = "aaaaaaaaaaaa";
        System.out.println(minimumLength(s));
    }

    public static int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                int left = start + 1;
                boolean leftUpdate = true;
                int right = end - 1;
                boolean rightUpdate = true;
                while (s.charAt(left) == s.charAt(start)) {
                    leftUpdate = false;
                    left++;
                }
                if (!leftUpdate) {
                    start = left;
                }

                while (s.charAt(right) == s.charAt(end)) {
                    rightUpdate = false;
                    right--;
                }
                if (!rightUpdate) {
                    end = right;
                }
                s = s.substring(++start, end);
                start = 0;
                end = s.length() - 1;
            } else {
                start++;
                end--;
            }
        }
        return s.length();
    }
}
