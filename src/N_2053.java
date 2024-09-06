import java.util.HashMap;
import java.util.Map;

/*
 * Level: 🟢🟢🟢
 * Status: InProcess
 * Time Complexity: O(n)
 * Runtime:
 * */
void main() {
    System.out.println(kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2));
    System.out.println(kthDistinct(new String[]{"aaa", "aa", "a"}, 1));
    System.out.println(kthDistinct(new String[]{"a", "b", "a"}, 3));
}

public String kthDistinct(String[] arr, int k) {
    Map<String, Integer> countElements = countElements(arr);
    return findKthDistinct(countElements, k);
}

private Map<String, Integer> countElements(String[] arr) {
    Map<String, Integer> map = new HashMap<>();
    for (String str : arr) {
        map.put(str, map.getOrDefault(str, 0) + 1);
    }
    return map;
}

public String findKthDistinct(Map<String, Integer> countElements, int k) {
    for (Map.Entry<String, Integer> entry : countElements.entrySet()) {
        if (entry.getValue() == k) {
            k--;
            if (k == 0) {
                return entry.getKey();
            }
        }
    }
    return "";
}