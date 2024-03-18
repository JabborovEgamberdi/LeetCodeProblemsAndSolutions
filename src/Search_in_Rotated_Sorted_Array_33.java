/*

    Level: MEDIUM 🟡🟡🟡

    Result:
  Successfully finished with runtime 0 ms
  Beats 100% of users with Java
  86.75% of solutions used 0 ms of runtime

    Time Complexity:
       first way: O (n);
                     n - length of input string;
       second way: O (1)

*/

public class Search_in_Rotated_Sorted_Array_33 {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println(search2(nums1, target1));
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println(search2(nums2, target2));
        int[] nums3 = {1};
        int target3 = 1;
        System.out.println(search2(nums3, target3));
        int[] nums4 = {1, 3};
        int target4 = 3;
        System.out.println(search2(nums4, target4));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int medium = (nums.length - 1) / 2;
        if (target > medium) {
            right = medium + 1;
        } else {
            left = medium - 1;
        }
        while (left <= right) {
            if (nums[left] == target) {
                return left;
            }
            left++;
        }
        return -1;
    }

    // working
    public static int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }

}
