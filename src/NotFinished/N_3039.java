import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

void main() {
    lastNonEmptyString("aabcbbca");
}

public static String lastNonEmptyString(String s) {
    int[] arr = new int[26];
    for (int i = 0; i < s.length(); i++) {
        arr[s.charAt(i) - 'a']++;
    }
    System.out.println(Arrays.toString(arr));
    while (s.isEmpty()) {
        s = s.trim();
        char c = s.charAt(0);
    }
    return s;
}