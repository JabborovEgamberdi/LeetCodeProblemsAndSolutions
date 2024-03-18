/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Time complexity: O(n) --> 0 ms
 * Space complexity: O(1)
 * */
public class N_153 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums2));
        int[] nums3 = {11, 13, 15, 17};
        System.out.println(findMin(nums3));
        int[] nums4 = {2, 1};
        System.out.println(findMin(nums4));
        int[] nums5 = {1, 2};
        System.out.println(findMin(nums5));
        int[] nums6 = {2, 3, 1};
        System.out.println(findMin(nums6));
        int[] nums7 = {3, 1, 2};
        System.out.println(findMin(nums7));
        int[] nums8 = {3, 1};
        System.out.println(findMin(nums8));
        int[] nums9 = {1, 3};
        System.out.println(findMin(nums9));
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int minimum = Math.min(nums[start], nums[end]);
            if (minimum < min) min = minimum;
            start++;
            end--;
        }
        return min;
    }

}