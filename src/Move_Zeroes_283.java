import java.util.Arrays;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        int[] nums = moveZeroes(new int[]{0, 1, 0, 3, 12});
        System.out.println(Arrays.toString(nums));
    }

    // first solution
    public static int[] moveZeroes(int[] nums) {
        int zero = 0;
        for (int num : nums) {
            if (num == 0) {
                zero++;
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (zero == 0) {
                break;
            }
            nums[i] = 0;
            zero--;
        }
        return nums;
    }

}