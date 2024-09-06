import java.util.HashMap;
import java.util.Map;

/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Runtime: 20 ms --> 45.3
 */
void main() {
    System.out.println(mostFrequentEven(new int[]{0, 1, 2, 2, 4, 4, 1}));
    System.out.println(mostFrequentEven(new int[]{4, 4, 4, 9, 2, 4}));
    System.out.println(mostFrequentEven(new int[]{29, 47, 21, 41, 13, 37, 25, 7}));
}

public int mostFrequentEven(int[] nums) {
    Map<Integer, Integer> calculateElementsCount = calculateElementsCount(nums);
    return findMostFrequentEven(calculateElementsCount);
}

private int findMostFrequentEven(Map<Integer, Integer> elementsCount) {
    int count = 0;
    int mostFrequent = -1;
    for (Map.Entry<Integer, Integer> element : elementsCount.entrySet()) {
        if (element.getValue() > count) {
            mostFrequent = element.getKey();
            count = element.getValue();
        } else if (element.getValue() == count) {
            mostFrequent = Math.min(element.getKey(), mostFrequent);
        }
    }
    return mostFrequent;
}

private Map<Integer, Integer> calculateElementsCount(int[] nums) {
    Map<Integer, Integer> elementsCount = new HashMap<>();
    for (int num : nums) {
        if (num % 2 != 0) {
            continue;
        }
        elementsCount.put(num, elementsCount.getOrDefault(num, 0) + 1);
    }
    return elementsCount;
}