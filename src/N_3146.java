import java.util.HashMap;
import java.util.Map;

void main() {
    System.out.println(findPermutationDifference("abc", "bac"));
    System.out.println(findPermutationDifference2("abc", "bac"));
}

// 4 ms
public static int findPermutationDifference(String s, String t) {
    Map<Integer, Character> sMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        sMap.put(i, s.charAt(i));
    }
    Map<Integer, Character> tMap = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
        tMap.put(i, t.charAt(i));
    }
    int result = 0;
    for (int i = 0; i < sMap.size(); i++) {
        for (int j = 0; j < tMap.size(); j++) {
            if (sMap.get(i) == tMap.get(j)) {
                result += Math.abs(i - j);
                break;
            }
        }
    }
    return result;
}

// 1 ms
public static int findPermutationDifference2(String s, String t) {
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                result += Math.abs(i - j);
            }
        }
    }
    return result;
}