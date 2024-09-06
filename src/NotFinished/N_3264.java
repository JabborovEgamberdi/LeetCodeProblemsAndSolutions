import java.util.Arrays;

/*
* Level: 🟢🟢🟢
* Status: DONE
*
* */
void main() {
    System.out.println(Arrays.toString(getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)));
    System.out.println(Arrays.toString(getFinalState(new int[]{1, 2}, 3, 4)));
}

public int[] getFinalState(int[] nums, int k, int multiplier) {
    while (k > 0) {
        int minNumIndex = findMinimumNumsIndex(nums);
        nums[minNumIndex] = nums[minNumIndex] * multiplier;
        k--;
    }
    return nums;
}

private int findMinimumNumsIndex(int[] nums) {
    int minNumIndex = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] < nums[minNumIndex]) {
            minNumIndex = i;
        }
    }
    return minNumIndex;
}