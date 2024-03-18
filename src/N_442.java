import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
* Level: 🟡🟡🟡
* Status: DONE
* TimeComplexity: O(n)
* Runtime: 15 ms --> 36%
* */
public class N_442 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    // 15 ms --> 36%
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                result.add(nums[i]);
            }
        }
        return result;
    }

}