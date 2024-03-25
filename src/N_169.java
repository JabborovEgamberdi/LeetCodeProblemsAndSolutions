/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Runtime: 1 ms -> Beats 99.66% of users with Java
* */

public class N_169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 3};
        System.out.println(majorityElement(nums));
        int[] nums1 = {8, 8, 7, 7, 7};
        System.out.println(majorityElement(nums1));
    }

    // 1 ms -->> 99.66%
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            if (num == candidate) count++;
            else count--;
        }
        return candidate;
    }

    // done -->> 2222 ms
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
