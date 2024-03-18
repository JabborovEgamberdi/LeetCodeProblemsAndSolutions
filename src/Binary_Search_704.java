public class Binary_Search_704 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(nums, target));
        System.out.println(search(nums, 2));
        System.out.println(search(nums, -1));
        int[] nums2 = { 2, 5 };
        System.out.println(search(nums2, 5));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int index = 0;

        if (nums[nums.length / 2] > target) {
            end = nums.length / 2;
        } else if (nums[nums.length / 2] < target) {
            start = nums.length / 2;
        }
        if (nums[nums.length / 2] == target) {
            return nums.length / 2;
        }
        while (start < end) {
            if (nums[index] == target) {
                return index;
            }
            start++;
            index++;
        }
        return -1;
    }
}