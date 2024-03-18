/*
* Level: 🟡🟡🟡
* Status: DONE
* Time complexity: O(n) --> 0 ms
* Space complexity: O(1)
* */
public class N_81 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int target = 1;
        System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

}