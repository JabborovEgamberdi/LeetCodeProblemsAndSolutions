import java.util.Arrays;

/*

    Level: Easy 🟢

    Result:
  Successfully finished with runtime 0 ms
  90.5% of solutions used 0 ms of runtime

    Time Complexity:
       first way: O (n);
                     n - length of input string;
       second way: O (n)
                     n - length of input string;

    Space Complexity: first way: O (1);

*/
public class Running_Sum_of_1d_Array_1480 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
        int[] nums1 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(runningSum(nums1)));
        int[] nums2 = {4, 6, 8, 10};
        System.out.println(Arrays.toString(runningSumSecondWay(nums2)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + nums[i];
            result[i] = count;
        }
        return result;
    }

    public static int[] runningSumSecondWay(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

}