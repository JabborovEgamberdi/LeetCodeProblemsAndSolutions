/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Space Complexity: O(1)
* Runtime: 2 ms Beats 98.34% of users with Java
* */

/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 * */
void main() {
    System.out.println(isAnagram("anagram", "nagaram"));
}

public static boolean isAnagram(String s, String t) {
    int[] arr = new int[26];
    for (char c : s.toCharArray()) {
        arr[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
        arr[c - 'a']--;
    }
    for (int i : arr) {
        if (i != 0) return false;
    }
    return true;
}