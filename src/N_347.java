/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Runtime: 13 ms, faster than 73.51% of Java online submissions
 * TimeComplexity: O (nlogk)
 * */

import java.util.*;

void main() {
    System.out.println(Arrays.toString(topKFrequent1(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
}

// TimeComplexity: O(NlogK)
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

// TimeComplexity: O(N)
public int[] topKFrequent1(int[] nums, int k) {
    Map<Integer, Integer> elements = elementsCount(nums);
    List<Integer>[] frequency = new ArrayList[nums.length + 1];
    for (int i = 0; i < frequency.length; i++) {
        frequency[i] = new ArrayList<>();
    }
    for (Map.Entry<Integer, Integer> element : elements.entrySet()) {
        frequency[element.getValue()].add(element.getKey());
    }
    int[] result = new int[k];
    int index = 0;
    for (int i = frequency.length - 1; i >= 0; i--) {
        for (int num : frequency[i]) {
            if (index == k) {
                return result;
            }
            result[index++] = num;
        }
    }
    return new int[0];
}