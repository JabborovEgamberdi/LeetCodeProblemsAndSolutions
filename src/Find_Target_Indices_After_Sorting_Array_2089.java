import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array_2089 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
        System.out.println(targetIndices2(nums, target));
    }

    // First Solution
    // Time complexity: O(nlogn)
    // Space complexity: O(n)
    // Runtime: 2 ms, faster than 72.50% of Java online submissions for Find Target Indices After Sorting Array.
    // 40.5% of solutions used 2 ms of runtime
    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    // Second Solution
    // Time complexity: O(n)
    // Space complexity: O(n)
    // Runtime: 0 ms, faster than 40.50% of Java online submissions for Find Target Indices After Sorting Array.
    // 14.93% of solutions used 0 ms of runtime
    private static List<Integer> targetIndices2(int[] nums, int target) {
        int count = 0;
        int lessThan = 0;
        for (int i : nums) {
            if (i < target) {
                lessThan++;
            } else if (i == target) {
                count++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessThan++);
        }
        return result;
    }

}