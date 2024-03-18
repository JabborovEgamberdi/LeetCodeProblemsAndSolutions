public class Search_Insert_Position_35 {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        int index = searchInsert(nums, target);
        System.out.println(STR."index: \{index}");
    }

    // First solution
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        if (nums.length == 1) {
            if (nums[0] > target) {
                return 0;
            } else if (nums[0] < target) {
                return 1;
            } else {
                return nums.length;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
            if (nums[i] < target && nums[i + 1] > target) {
                index = i + 1;
                break;
            }
            if (nums[nums.length - 1] < target) {
                index = nums.length;
                break;
            }
        }
        return index;
    }

}