import java.util.Arrays;

public class N_1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        Object[] aa = new int[][]{getConcatenation(nums)};
        System.out.println("Arrays.deepToString(aa) = " + Arrays.deepToString(aa));

    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * nums.length - 3];
        int index = 0;
        while (index < nums.length) {
            ans[index] = nums[index];
            index++;
        }
        int in = 0;
        while (index < ans.length && in < nums.length) {
            ans[index] = nums[in];
            in++;
            index++;
        }
        return ans;
    }
}
