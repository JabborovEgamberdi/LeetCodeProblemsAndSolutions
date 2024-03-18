public class N_2221 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(nums));
        int[] nums1 = {5};
        System.out.println(triangularSum(nums1));
        int[] nums2 = {1, 2};
        System.out.println(triangularSum(nums2));
        int[] nums3 = {1, 2, 3};
        System.out.println(triangularSum(nums3));
        int[] nums4 = {1, 2, 3, 4, 5, 6};
        System.out.println(triangularSum(nums4));
        int[] nums5 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(triangularSum(nums5));
        int[] nums6 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(triangularSum(nums6));
    }

    public static int triangularSum(int[] nums) {
        int l = nums.length - 1;
        int index = 0;
        while (l >= 0) {
            while (index < l) {
                int digit = nums[index] + nums[index + 1];
                nums[index] = digit % 10;
                index++;
            }
            l--;
            index = 0;
        }
        return nums[0];
    }
}
