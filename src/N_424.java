/*
* Level: 🟡🟡🟡
* Status: DONE
* Time Complexity: O(n ^ 2)
* Runtime: 838 ms --> 5.01%
* */

// TODO: should be optimize
void main() {
    System.out.println(characterReplacement("AABABBA", 1));
    System.out.println(characterReplacement("ABAB", 2));
}

// 838 ms --> 5.01 %
public static int characterReplacement(String s, int k) {
    if (s.isEmpty()) return 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
        int count = 1;
        int index = 0;
        for (int j = i + 1; j < s.length(); j++) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
            } else {
                if (index + 1 <= k) {
                    index += 1;
                    count++;
                } else break;
            }
        }
        if (index < k) {
            count += k - index;
            if (count > s.length())
                return s.length();
        }
        max = Math.max(max, count);
    }
    return max;
}