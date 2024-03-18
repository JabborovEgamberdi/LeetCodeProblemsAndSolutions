package NotFinished;

public class N_169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
        int[] nums1 = {8, 8, 7, 7, 7};
        System.out.println(majorityElement1(nums1));
    }

    public static int majorityElement(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    if (i != j) count++;
            }
            if (count / 2 > 0) return nums[i];
            else count = 1;
        }
        return count;
    }

    // done
    public static int majorityElement1(int[] nums) {
        int maxElement = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    if (i != j) count++;
            }
            if (count / 2 > 0 && count > maxCount) {
                maxCount = count;
                maxElement = nums[i];
            }
        }
        return maxElement;
    }
}
