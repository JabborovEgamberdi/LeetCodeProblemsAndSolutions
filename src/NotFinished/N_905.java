package NotFinished;

import java.util.Arrays;

public class N_905 {
    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));

        int[] nums1 = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity1(nums1)));

        int[] nums2 = {0, 1};
        System.out.println(Arrays.toString(sortArrayByParity1(nums2)));

    }

    public static int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (nums[left] % 2 == 0) {
                left++;
            }
            while (nums[right] % 2 == 1) {
                right--;
            }
            swap(nums, left, right);
            left++;
            right--;
        }
        return nums;
    }

    public static int[] sortArrayByParity1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            }
            if (nums[right] % 2 == 1) {
                right--;
            }
            swap(nums, left, right);
            left++;
            right--;
        }
        return nums;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}