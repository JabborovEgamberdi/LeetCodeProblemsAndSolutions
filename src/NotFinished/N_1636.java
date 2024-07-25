import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

void main() {
    System.out.println(Arrays.toString(frequencySort(new int[]{1, 1, 2, 2, 2, 3})));
}

public static int[] frequencySort(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }
    System.out.println(map);
    return null;
}