/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Space Complexity: O(1)
* Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Special Characters in a String.
* */

void main() {
    System.out.println(numberOfSpecialChars("aaAbcBC"));
}

public int numberOfSpecialChars(String word) {
    int[] a = new int[26];
    int[] b = new int[26];
    for (char c : word.toCharArray()) {
        if (c >= 'a' && c <= 'z') {
            a[c - 'a']++;
        } else {
            b[c - 'A']++;
        }
    }
    int count = 0;
    for (int i = 0; i < 26; i++) {
        if (a[i] != 0 && b[i] != 0) {
            count++;
        }
    }
    return count;
}