import java.util.HashSet;
import java.util.Set;

// Level: Medium🟡🟡🟡
// Time complexity: O(n)
// Space complexity: O(n)
// Runtime: 55 ms, faster than 71.88% of Java online submissions for Find Target Indices After Sorting Array.
// 12.05% of solutions used 55 ms of runtime
public class Count_Number_of_Distinct_Integers_After_Reverse_Operations_2442 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2};
        System.out.println(countDistinctIntegers(nums));
        System.out.println(countDistinctIntegers(new int[]{1, 13, 10, 12, 31}));
        System.out.println(countDistinctIntegers(new int[]{2, 2, 2, 2, 2}));
        System.out.println(countDistinctIntegers(new int[]{1, 2, 3, 4, 5}));
        System.out.println(countDistinctIntegers(new int[]{1, 2, 3, 4, 5, 6}));
    }

    private static int countDistinctIntegers(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for (int num : nums) {
            result.add(num);
            result.add(reverse(num));
        }
        return result.size();
    }

    private static int reverse (int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            num = num / 10;
        }
        return reverse;
    }

}