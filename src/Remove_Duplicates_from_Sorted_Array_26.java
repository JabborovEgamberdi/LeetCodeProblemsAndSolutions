import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array_26 {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5};
        int[] nums1 = new int[]{1, 1, 2};
        int[] result = removeDuplicates(nums1);
        Object[] o = new int[][]{result};
        System.out.println(STR."result = \{Arrays.deepToString(o)}");
        int i = removeDuplicates2(nums);
        System.out.println("i = " + i);
        int i1 = removeDuplicates2(nums1);
        System.out.println("i1 = " + i1);

    }

    public static int[] removeDuplicates(int[] nums) {
        nums = new int[nums.length*2];
        int[] ass = new int[nums.length * 2];
        Set<Integer> removeDuplicates = new HashSet<>();
        for (int num : nums) {
            removeDuplicates.add(num);
        }
        int[] result = new int[removeDuplicates.size()];
        for (int i = 0; i < removeDuplicates.size(); i++) {
            result[i] = i;
        }
        return result;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                count++;
            }
        }
        return count;
    }

}