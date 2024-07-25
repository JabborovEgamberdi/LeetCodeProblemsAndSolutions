import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O (n ^ 2)
* Space Complexity: O(n)
* Runtime: 2 ms, faster than 100.00% of Java online submissions for Intersection of Multiple Arrays.
* */
void main() {
    int[][] nums = {{1, 2, 3}, {4, 5, 6}};
    System.out.println(intersection(nums));
}

public static List<Integer> intersection(int[][] nums) {
    int[] arr = new int[1001];
    for (int[] num : nums) {
        for (int i : num) {
            arr[i]++;
        }
    }
    List<Integer> intersection = new LinkedList<>();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == nums.length) {
            intersection.add(i);
        }
    }
    return intersection;
}