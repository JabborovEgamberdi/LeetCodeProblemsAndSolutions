import java.util.*;

/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Runtime: 5 ms, faster than 93.08% of Java online submissions
 * TimeComplexity: O (NlogN)
 * */
void main() {
    System.out.println(Arrays.toString(frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
}

// TimeComplexity: 5 ms --> 93.08%
public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> elements = elementsCount(nums);
    PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a, b) -> {
                if (Objects.equals(b.getValue(), a.getValue())) {
                    return b.getKey() - a.getKey();
                } else {
                    return a.getValue() - b.getValue();
                }
            });
    for (Map.Entry<Integer, Integer> element : elements.entrySet()) {
        heap.offer(element);
    }
    int[] res = new int[nums.length];
    int index = 0;
    while (!heap.isEmpty()) {
        Map.Entry<Integer, Integer> element = heap.poll();
        for (int i = 0; i < element.getValue(); i++) {
            res[index++] = element.getKey();
        }
    }
    return res;
}

private Map<Integer, Integer> elementsCount (int[] nums) {
    Map<Integer, Integer> elements = new HashMap<>();
    for (int num : nums) {
        elements.put(num, elements.getOrDefault(num, 0) + 1);
    }
    return elements;
}