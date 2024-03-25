package NotFinished;

public class N_2908 {
    public static void main(String[] args) {
        System.out.println(minimumSum(new int[]{8, 6, 1, 5, 3}));
        System.out.println(minimumSum(new int[]{5, 4, 8, 7, 10, 2}));
        System.out.println(minimumSum(new int[]{6, 5, 4, 3, 4, 5}));
    }

    public static int minimumSum(int[] nums) {
        int minSum = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                int sum = nums[i - 1] + nums[i] + nums[i + 1];
                if (minSum == 0) minSum = sum;
                if (minSum > sum) minSum = sum;
            }
        }
        return minSum == 0 ? -1 : minSum;
    }
}