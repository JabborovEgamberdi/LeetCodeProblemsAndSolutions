import java.util.*;

void main() {
    String s = "tree";
    System.out.println(frequencySort1(s));
    String s1 = "Aabb";
    System.out.println(frequencySort1(s1));
}

public static String frequencySort(String s) {
    Map<Character, Integer> elements = new HashMap<>();
    for (char c : s.toCharArray()) {
        elements.put(c, elements.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (o1, o2) -> o2.getValue() - o1.getValue()
    );
    pq.addAll(elements.entrySet());
    char[] result = new char[s.length()];
    int index = 0;
    while (!pq.isEmpty()) {
        Map.Entry<Character, Integer> entry = pq.poll();
        for (int i = 0; i < entry.getValue(); i++) {
            result[index++] = entry.getKey();
        }
    }
    return new String(result);
}

public static String frequencySort1(String s) {
    Map<Character, Integer> elements = new HashMap<>();
    for (char c : s.toCharArray()) {
        elements.put(c, elements.getOrDefault(c, 0) + 1);
    }
    List<Character> chars = new ArrayList<>(elements.keySet());
    chars.sort((a, b) -> Integer.compare(elements.get(b), elements.get(a)));
    StringBuilder sb = new StringBuilder();
    for (Character c : chars) {
        for (int i = 0; i < elements.get(c); i++) {
            sb.append(c);
        }
    }
    return String.valueOf(sb);
}