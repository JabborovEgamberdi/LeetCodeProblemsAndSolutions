/*
* Level: 🟡🟡🟡
* Status: DONE
* Runtime: 1 ms --> 99.63 %
* Time Complexity: O(n)
* Space Complexity: O(1)
* */
void main() {
    System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    System.out.println(minSubArrayLen(4, new int[]{1, 4, 4}));
    System.out.println(minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
}

public int minSubArrayLen(int target, int[] nums) {
    int result = Integer.MAX_VALUE;
    int sum = 0;
    int left = 0;
    for (int right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (sum >= target) {
            result = Math.min(result, right - left + 1);
            sum -= nums[left++];
        }
    }
    return result == Integer.MAX_VALUE ? 0 : result;
}