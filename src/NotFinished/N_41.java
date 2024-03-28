package NotFinished;

import java.util.Arrays;

public class N_41 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(new N_41().firstMissingPositive(nums));
        System.out.println(new N_41().firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(new N_41().firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        System.out.println(new N_41().firstMissingPositive(new int[]{1, 2, 3, 4}));
        System.out.println(new N_41().firstMissingPositive(new int[]{1, 1}));
        System.out.println(new N_41().firstMissingPositive(new int[]{1}));
        System.out.println(new N_41().firstMissingPositive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(new N_41().firstMissingPositive(new int[]{2, 2, 1, 1, 0}));
    }

    public int firstMissingPositive(int[] nums) {
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
            if (!arr[nums[i]]) num++;
            else arr[nums[i]] = true;
        }
        return num;
    }
}
