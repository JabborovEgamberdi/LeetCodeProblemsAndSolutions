package NotFinished;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/*
* Level: 🔴🔴🔴
* Status: DONE
* Time Complexity: O(n)
* Space Complexity: O(1)
* Runtime: 0 ms Beats 100.00% of users with Java
* */
public class N_41 {
    public static void main(String[] args) {
        int[] case1 = {7, 8, 9, 10, 11};
        System.out.println(firstMissingPositive(case1));
        int[] case2 = {3, 4, -1, 1};
        System.out.println(firstMissingPositive2(case2));
        int[] case3 = {1, 2, 0};
        System.out.println(firstMissingPositive2(case3));
        int[] case4 = {0, 2, 2, 1, 1};
        System.out.println(firstMissingPositive2(case4));
    }

    // it works but TLE
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new LinkedList<>();
        for (int j : nums) {
            if (j > 0) {
                if (!list.contains(j)) {
                    list.add(j);
                }
            }
        }
        int num = 1;
        for (Integer integer : list) {
            if (integer != num) return num;
            num++;
        }
        return num;
    }

    // 0 ms --> 100 ms
    public static int firstMissingPositive2(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                arr[num] = true;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) return i;
        }
        return -1;
    }

}