import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*
* Level: 🟢🟢🟢
* Status: DONE
* TimeComplexity: O(n) -> 0 ms and 5 ms (up to solutions)
* */
public class N_268 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        System.out.println(missingNumber(new int[]{0}));
        System.out.println(missingNumber(new int[]{1}));
        System.out.println(missingNumber(new int[]{2}));
        System.out.println(missingNumber(new int[]{3}));
        System.out.println(missingNumber(new int[]{4}));
        System.out.println(missingNumber(new int[]{5}));
        System.out.println(missingNumber(new int[]{6}));
        System.out.println(missingNumber2(new int[]{7}));
        System.out.println(missingNumberHashTable(new int[]{8}));
        System.out.println(missingNumberMath(new int[]{9}));
    }

    // 0 ms
    public static int missingNumberMath(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // 5 ms
    public static int missingNumberHashTable(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    // 5 ms
    public static int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }

    // 2 ms
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] isPresent = new boolean[n + 1];
        for (int num : nums) {
            isPresent[num] = true;
        }
        for (int i = 0; i <= n; i++) {
            if (!isPresent[i]) return i;
        }
        return 0;
    }
}
