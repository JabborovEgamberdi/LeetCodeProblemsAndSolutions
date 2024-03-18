import java.util.Arrays;

/*

 * Level:  Medium 🟡🟡🟡
 * TimeComplexity: O(n)
 * SpaceComplexity: O(1)
 * Runtime: 1 ms, faster than 53.98% of Java online submissions for Rotate Array.
 *
 * */
public class Rotate_Array_189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(STR."Arrays.deepToString(rotate(nums, k)) = \{Arrays.toString(rotate(nums, k))}");
        System.out.println(STR."Arrays.deepToString(rotate2(nums, k)) = \{Arrays.toString(rotate2(nums, k))}");
        System.out.println(STR."Arrays.deepToString(rotate3(nums, k)) = \{Arrays.toString(rotate3(nums, k))}");
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k2 = 3;
        System.out.println(STR."Arrays.deepToString(rotate(nums, k)) = \{Arrays.deepToString(rotate(nums2, k2))}");
        System.out.println(STR."Arrays.deepToString(rotate2(nums, k)) = \{Arrays.toString(rotate2(nums2, k2))}");
        System.out.println(STR."Arrays.deepToString(rotate3(nums, k)) = \{Arrays.toString(rotate3(nums2, k2))}");

        int[] nums3 = {1, 2};
        int k3 = 5;
        System.out.println(STR."Arrays.deepToString(rotate(nums, k)) = \{Arrays.toString(rotate(nums3, k3))}");
        System.out.println(STR."Arrays.deepToString(rotate2(nums, k)) = \{Arrays.toString(rotate2(nums3, k3))}");
        System.out.println(STR."Arrays.deepToString(rotate3(nums, k)) = \{Arrays.toString(rotate3(nums3, k3))}");
    }

    public static Object[] rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length - k;
        while (right < nums.length) {
            int temp;
            temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right++;
        }
        return new int[][]{nums};
    }

    // it is working
    private static int[] rotate2(int[] nums, int k) {

        int n = nums.length;

        if (k > n) {
            while (k >= n) {
                k = k - n;
            }
        }

        if (k % n == 0) return nums;

        int[] arr = new int[k];
        int index = 0;
        for (int i = n - k; i < n; i++) {
            arr[index] = nums[i];
            index++;
        }

        int in = n - 1;
        for (int i = n - k - 1; i >= 0; i--) {
            nums[in] = nums[i];
            in--;
        }
        int length = arr.length;
        while (length > 0) {
            nums[length - 1] = arr[length - 1];
            length--;
        }
        return nums;
    }

    private static int[] rotate3(int[] nums, int k) {

        int n = nums.length;
        k = k % n;
        if (k == 0) return nums;

        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;
    }


}
