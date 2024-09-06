/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Runtime: 13 ms, faster than 73.51% of Java online submissions
 * TimeComplexity: O (nlogk)
 * */

import java.util.*;

void main() {
    System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
}

public int[] topKFrequent(int[] nums, int k) {
    int[] result = new int[k];
    Map<Integer, Integer> elements = elementsCount(nums);
    PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
    for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
        heap.offer(entry);
    }
    for (int i = 0; i < k; i++) {
        result[i] = Objects.requireNonNull(heap.poll()).getKey();
    }
    return result;
}

private Map<Integer, Integer> elementsCount(int[] nums) {
    Map<Integer, Integer> elements = new HashMap<>();
    for (int num : nums) {
        elements.put(num, elements.getOrDefault(num, 0) + 1);
    }
    return elements;
}