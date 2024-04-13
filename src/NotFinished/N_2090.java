package NotFinished;

import java.util.Arrays;

public class N_2090 {
    public static void main(String[] args) {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(nums, k)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int[] averages = new int[nums.length];
        Arrays.fill(averages, -1);
        if (k == 0) return nums;
        if (k > nums.length) return new int[]{-1};
        int sum = 0;
        for (int i = 0; i < k * 2 + 1; i++) {
            sum += nums[i];
        }
        averages[k] = sum / (k * 2 + 1);
        for (int i = k * 2 + 1; i < nums.length; i++) {
            sum += nums[i] - nums[i - (k * 2 + 1)];
            averages[i - k] = sum / (k * 2 + 1);
        }
        return averages;
    }
}