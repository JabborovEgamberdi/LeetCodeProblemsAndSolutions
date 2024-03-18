package NotFinished;

public class N_215 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(findKthLargest(nums, 2));
    }

    private static int findKthLargest(int[] nums, int k) {
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        k--;
        if (k != 0) {
            nums[index] = 0;
            return findKthLargest(nums, k);
        }


        return max;
    }

}