/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Runtime: 6 ms, faster than 83.90% of Java online submissions for First Unique Character in a String.
 */
void main() {
    System.out.println(firstUniqChar("loveleetcode"));
    System.out.println(firstUniqChar("aabb"));
    System.out.println(firstUniqChar("a"));
    System.out.println(firstUniqChar("aa"));
    System.out.println(firstUniqChar("aadadaad"));
    System.out.println(firstUniqChar("leetcode"));
    System.out.println(firstUniqChar("aabbc"));
    System.out.println(firstUniqChar("aabbccddeeff"));
    System.out.println(firstUniqChar("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"));
}

public static int firstUniqChar(String s) {
    int[] arr = new int[26];
    for (char c : s.toCharArray()) {
        arr[c - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
        if (arr[s.charAt(i) - 'a'] == 1)
            return i;
    }
    return -1;
}