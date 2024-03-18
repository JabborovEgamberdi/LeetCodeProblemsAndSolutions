import java.util.Arrays;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Runtime: 1 ms Beats 100.00% of users with Java
* */
public class Squares_of_a_Sorted_Array_977 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares1(nums)));
        System.out.println(Arrays.toString(sortedSquares2(new int[]{-7,-3,2,3,11})));
        System.out.println(Arrays.toString(sortedSquares2(new int[]{-5,-4,-3,-2,-1,0,1,2,3,4,5})));
    }

    public static int[] sortedSquares1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    // Runtime: 1 ms Beats 100.00% of users with Java
    public static int[] sortedSquares2(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare >= rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;

    }

}