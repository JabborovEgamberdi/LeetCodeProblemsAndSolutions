/*

    Level: MEDIUM 🟢🟢🟢

    Result:
  Successfully finished with runtime 0 ms

    Time Complexity: O (n * 2);
                     n - length of input string;


*/
public class Form_Smallest_Number_From_Two_Digit_Arrays_2605 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6, 7, 8};
        System.out.println(minNumber(nums1, nums2));
    }

    public static int minNumber(int[] nums1, int[] nums2) {
        int min1 = sort(nums1);
        int min2 = sort(nums2);
        int check = areEqual(nums1, nums2);
        if (check == 0)
            return min1 < min2 ? min1 * 10 + min2 : min2 * 10 + min1;
        else return check;
    }

    private static int sort(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    private static int areEqual(int[] nums1, int[] nums2) {
        int same = 0;
        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    if (same == 0) {
                        same = k;
                    } else if (same > k) {
                        same = k;
                    }
                }
            }
        }
        return same;
    }

}