package NotFinished;

import java.util.Arrays;

public class N_2090 {
    public static void main(String[] args) {
        int[] nums = {7, 4, 3, 9, 1, 8, 5, 2, 6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(nums, k)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs, -1);
        int sum = 0;
        for (int i = 0; i < (k * 2) + 1; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length - k; i++) {
            sum += nums[i] - nums[i - k];
            if (max < sum) max = sum;
        }
        return avgs;
    }
}