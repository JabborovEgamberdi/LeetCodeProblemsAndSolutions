import java.util.List;

/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O(n)
 * Runtime:
 * */
void main() {
    System.out.println(reverseVowels("hello"));
}

// 16 ms --> 15.51%
public static String reverseVowels(String s) {
    List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
    int left = 0;
    int right = s.length() - 1;
    char[] chars = s.toCharArray();
    while (left <= right) {
        if (vowels.contains(chars[left]) && vowels.contains(chars[right])) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        } else if (vowels.contains(chars[left]) && !vowels.contains(chars[right])) {
            right--;
        } else if (!vowels.contains(chars[left]) && vowels.contains(chars[right])) {
            left++;
        } else {
            left++;
            right--;
        }
    }
    return new String(chars);
}
