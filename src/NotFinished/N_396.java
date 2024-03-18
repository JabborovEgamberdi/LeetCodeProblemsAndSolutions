package NotFinished;

public class N_396 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 6};
        System.out.println(maxRotateFunction(nums));
    }

    public static int maxRotateFunction(int[] nums) {
        int n = nums.length - 1;
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int index = 0;
            while (n >= index) {
                sum += index * nums[index];
                index++;
            }
            sums[i] = sum;
            n--;
            if (n >= 0) {
                maxRotateFunction(shift(nums));
            }
        }
        return sort(sums);
    }

    private static int[] shift(int[] nums) {
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i + 1] = nums[i];
        }
        nums[0] = temp;
        return nums;
    }

    private static int sort(int[] sums) {
        int max = sums[0];
        for (int sum : sums) {
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
