package NotFinished;

import java.util.Arrays;

public class N_41 {
    public static void main(String[] args) {
        int[] case1 = {7, 8, 9, 10, 11};
        System.out.println(firstMissingPositive(case1));
        int[] case2 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive(case2));
        int[] case3 = {1, 2, 0};
        System.out.println(firstMissingPositive(case3));
        int[] case4 = {0, 2, 2, 1, 1};
        System.out.println(firstMissingPositive(case4));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                index = i;
                break;
            }
        }
        int num = 1;
        boolean[] arr = new boolean[nums.length];
        for (int i = index; i < nums.length; i++) {
            if (nums[i] != num) return num;
            if (!arr[nums[i]]) {
                num++;
            }
            arr[nums[i]] = true;
        }
        return num;
    }

}