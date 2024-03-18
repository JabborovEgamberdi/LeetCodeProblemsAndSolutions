import java.util.ArrayList;
import java.util.Arrays;

// Level: MEDIUM

public class FindFirst_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public static void main(String[] args) {
//        int[] nums = {5, 7, 7, 8, 8, 10};
//        int[] nums = {3, 3, 3};
//        int[] nums = {1, 4};
        int[] nums = {2, 2};
        int target = 2;
        int[] result = searchRange(nums, target);
        String result_s = Arrays.toString(result);
        System.out.println(STR."result: \{result_s}");
    }

    // First Solution
    // Runtime 1 ms, 22.74 %
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int targetCount = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetCount++;
                arrayList.add(i);
            }
        }
        if (targetCount > 2) {
            return new int[]{arrayList.get(0), arrayList.get(arrayList.size() - 1)};
        }
        if (targetCount == 0) {
//            if (target > nums[nums.length - 1]) {
//                return new int[]{nums.length, nums.length};
//            }
//            if (target < nums[0]) {
//                return new int[]{-1, -1};
//            }
            return new int[]{-1, -1};
        }
        if (targetCount == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == target) {
                    return new int[]{i, i};
                }
                if (nums[i] < target && nums[i + 1] > target) {
                    return new int[]{i + 1, i + 1};
                }
                if (nums[nums.length - 1] < target) {
                    return new int[]{nums.length, nums.length};
                }
                if (nums[nums.length - 1] == target) {
                    return new int[]{nums.length - 1, nums.length - 1};
                }
            }
        }
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                if (index > 2) {
                    result[1] = i;
                }
                result[index] = i;
                index++;
            }
            if (nums[i] < target && nums[i + 1] > target) {
                result[1] = i + 1;
            }
            if (nums[i] == nums[i + 1] && nums[i] == target) {
                result[0] = i;
                result[1] = i + 1;
            }
        }
        return result;
    }


    // Second Solution
    // Runtime will 0 ms, 100 %
    public static int[] searchRange2(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int targetCount = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetCount++;
                arrayList.add(i);
            }
        }
        if (targetCount == 0) {
            return new int[]{-1, -1};
        }
        if (targetCount > 2) {
            return new int[]{arrayList.get(0), arrayList.get(arrayList.size() - 1)};
        }

        if (targetCount == 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == target) {
                    return new int[]{i, i};
                }
                if (nums[i] < target && nums[i + 1] > target) {
                    return new int[]{i + 1, i + 1};
                }
                if (nums[nums.length - 1] < target) {
                    return new int[]{nums.length, nums.length};
                }
                if (nums[nums.length - 1] == target) {
                    return new int[]{nums.length - 1, nums.length - 1};
                }
            }
        }
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                if (index > 2) {
                    result[1] = i;
                }
                result[index] = i;
                index++;
            }
            if (nums[i] < target && nums[i + 1] > target) {
                result[1] = i + 1;
            }
            if (nums[i] == nums[i + 1] && nums[i] == target) {
                result[0] = i;
                result[1] = i + 1;
            }
        }
        return result;
    }
}