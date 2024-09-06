/*
 * Level: 🟡🟡🟡
 * Status: InProgress
 * Time Complexity: O(n)
 * Runtime:
 * */

void main() {
    System.out.println(minSwaps(new int[]{0, 1, 0, 1, 1, 0, 0}));
    System.out.println(minSwaps(new int[]{0, 1, 1, 1, 0, 0, 1, 1, 0}));
    System.out.println(minSwaps(new int[]{1, 1, 0, 0, 1}));
}

public static int minSwaps(int[] nums) {
    boolean isCircular = isCircular(nums);
    if (isCircular) {
        return countMiddleOnes(nums);
    }
    int countOfOnes = countOfOnes(nums);
    int maxGroup = countOfMaxGroup(nums);
    return countOfOnes - maxGroup;
}

private static Integer countOfOnes(int[] nums) {
    int count = 0;
    for (int num : nums) {
        if (num == 1)
            count++;
    }
    return count;
}

private static Integer countOfMaxGroup(int[] nums) {
    int max = 0;
    int count = 0;
    for (int num : nums) {
        if (num == 1) {
            count++;
        } else {
            max = Math.max(count, max);
            count = 0;
        }
    }
    return max;
}

private static boolean isCircular(int[] nums) {
    return nums[0] == 1 && nums[nums.length - 1] == 1;
}

private static Integer countMiddleOnes(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    while (nums[left] != 0 && nums[right] != 0) {
        if (nums[left] != 0 && nums[right] != 0) {
            left++;
            right--;
        } else if (nums[left] != 0) {
            left++;
        } else {
            right--;
        }
    }
    return countMiddleOnes(++left, right, nums);
}

private static Integer countMiddleOnes(int left, int right, int[] nums) {
    int count = 0;
    for (int i = left; i < right; i++) {
        if (nums[i] == 1)
            count++;
    }
    return count;
}