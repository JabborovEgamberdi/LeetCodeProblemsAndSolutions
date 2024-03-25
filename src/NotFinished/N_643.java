package NotFinished;

public class N_643 {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));

        int[] nums2 = {3, 5};
        int k2 = 2;
        System.out.println(findMaxAverage(nums2, k2));
    }

    public static double findMaxAverage2(int[] nums, int k) {
        double max = 0;
        int kk = k;
        for (int i = 0; i < nums.length - (k - 1); i++) {
            int index = i;
            double sum = 0;
            while (k > 0) {
                sum += nums[index];
                index++;
                k--;
            }
            k = kk;
            if (sum != 0) {
                if (max == 0) max = sum / k;
                if ((sum / k) > max) max = sum / k;
            }
        }
        return max;
    }

    public static double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length - (k - 1); i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            if (sum != 0) {
                if (max == 0) max = sum;
                if (sum > max) max = sum;
            }
        }
        return (double) max / k;
    }

    private static double findMaxAverage3(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxAvg = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, sum);
        }
        return maxAvg / k;
    }

}