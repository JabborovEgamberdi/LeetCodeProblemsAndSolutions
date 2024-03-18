/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * TimeComplexity: O(log n)
 * Runtime: 0 ms -- 100%
 * */
public class N_540 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
        System.out.println(singleNonDuplicate2(nums));
        System.out.println(singleNonDuplicate3(nums));
        System.out.println(singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 2, 3}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 2, 3, 3}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 2, 3, 3, 4}));
        System.out.println(singleNonDuplicate(new int[]{1, 1, 2, 2, 3, 3, 4, 4}));
    }

    // 2 ms --> 10%
    public static int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    i++;
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) return nums[i];
        }
        return -1;
    }

    public static int singleNonDuplicate2(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] == nums[mid ^ 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

    // 0 ms --> 100%
    @SuppressWarnings("DuplicatedCode")
    public static int singleNonDuplicate3(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            boolean isEven = mid % 2 == 0;
            if (isEven) {
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return nums[start];
    }


}
