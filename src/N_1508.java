import java.util.Arrays;
/*
 * Level: 🟡🟡🟡
 * Status: InProcess
 * Time Complexity: O(n ^ 2)
 * Runtime: 66 ms --> 68.47 %
 * */
void main() {
    System.out.println(rangeSum(new int[]{1, 2, 3, 4}, 4, 1, 5));
    System.out.println(rangeSum(new int[]{1, 2, 3, 4}, 4, 3, 4));
}

public int rangeSum(int[] nums, int n, int left, int right) {
    int[] subarraySums = new int[n * (n + 1) / 2 + 1];
    computeSubarraySums(subarraySums, nums);
    Arrays.sort(subarraySums);
    return sumWithinRange(subarraySums, left, right);
}

private int sumWithinRange(int[] subarraySums, int left, int right) {
    int totalSum = 0;
    final int MODULO = (int) 1e9 + 7;
    for (int i = left; i <= right; i++) {
        totalSum = (totalSum + subarraySums[i]) % MODULO;
    }
    return totalSum;
}

private void computeSubarraySums(int[] subarraySums, int[] nums) {
    int index = 0;
    int cumulativeSum = 0;
    for (int num : nums) {
        cumulativeSum += num;
        subarraySums[index] = cumulativeSum;
        index++;
    }
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            subarraySums[index] = subarraySums[j] - subarraySums[i];
            index++;
        }
    }
}