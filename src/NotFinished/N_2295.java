package NotFinished;

import java.util.Arrays;
import java.util.HashMap;

public class N_2295 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        int[][] operations = {{1, 3}, {4, 7}, {6, 1}};
        System.out.println(Arrays.toString(arrayChange3(nums, operations)));
        System.out.println(Arrays.toString(arrayChange(nums, operations)));
        System.out.println(Arrays.toString(arrayChange2(nums, operations)));
    }

    private static int[] arrayChange(int[] nums, int[][] operations) {
        for (int[] operation : operations) {
            int index = operation[0];
            int num = operation[1];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == index) {
                    nums[j] = num;
                    break;
                }
            }
        }
        return nums;
    }

    private static int[] arrayChange2(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] arr : operations) {
            map.put(arr[0], arr[1]);
        }
        for (int i = 0; i < map.size(); i++) {
            map.get(i);
        }
        return nums;
    }

    // 1 ms --> 80%
    private static int[] arrayChange3(int[] nums, int[][] operations) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int[] operation : operations) {
            int index = map.get(operation[0]);
            nums[index] = operation[1];

            map.remove(operation[0]);
            map.put(nums[index], index);
        }

        return nums;
    }

}