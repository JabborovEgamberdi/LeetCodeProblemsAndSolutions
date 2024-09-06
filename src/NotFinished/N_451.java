import java.util.HashMap;
import java.util.Map;

void main() {
    String s = "tree";
    System.out.println(frequencySort(s));
}

public static String frequencySort(String s) {
    Map<Character, Integer> elements = new HashMap<>();
    for (char c : s.toCharArray()) {
        elements.put(c, elements.getOrDefault(c, 0) + 1);
    }
    return null;
}