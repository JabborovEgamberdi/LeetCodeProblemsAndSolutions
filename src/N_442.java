import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
* Level: 🟡🟡🟡
* Status: DONE
* TimeComplexity: O(n)
* Runtime: 3 ms --> 99.83%
* */
public class N_442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates1(nums));
        System.out.println(findDuplicates2(nums));
    }

    // 15 ms --> 36%
    public static List<Integer> findDuplicates1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }

    // 3 ms --> 99.83%
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> result = new LinkedList<>();
        boolean[] ints = new boolean[nums.length + 1];
        for (int num : nums) {
            if (ints[num]) result.add(num);
            ints[num] = true;
        }
        return result;
    }

}