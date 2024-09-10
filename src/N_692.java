/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Runtime: 6 ms, faster than 97.91% of Java online submissions
 * TimeComplexity: O (NlogK)
 * Space Complexity: O (N)
 * */

import java.util.*;

void main() {
    System.out.println((topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2)));
    System.out.println((topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 1)));
}

// TimeComplexity: O(NlogK)
public List<String> topKFrequent(String[] words, int k) {
    Map<String, Integer> elements = elementsCount(words);
    PriorityQueue<Map.Entry<String, Integer>> heap =
            new PriorityQueue<>((a, b) -> {
                if (Objects.equals(a.getValue(), b.getValue())) {
                    return a.getKey().compareTo(b.getKey());
                } else {
                    return b.getValue() - a.getValue();
                }
            });
    heap.addAll(elements.entrySet());
    List<String> result = new ArrayList<>();
    while (k > 0) {
        Map.Entry<String, Integer> element = heap.poll();
        result.add(element.getKey());
        k--;
    }
    return result;
}

private Map<String, Integer> elementsCount(String[] words) {
    Map<String, Integer> elements = new HashMap<>();
    for (String word : words) {
        elements.put(word, elements.getOrDefault(word, 0) + 1);
    }
    return elements;
}