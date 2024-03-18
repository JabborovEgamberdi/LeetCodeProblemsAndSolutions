import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Element_27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        Arrays.sort(nums);
        int[] result = removeElement(nums, 2);
        Object[] object = new int[][]{result};
        String s = Arrays.deepToString(object);
        System.out.println(s);
        System.out.println(removeElements(nums, 3));
    }

    public static int[] removeElement(int[] nums, int val) {
        int count = 0;
        for (int num : nums) {
            if (num == val) {
                count++;
            }
        }
        Arrays.sort(nums);
        int[] arr = new int[nums.length - count];
        for (int i = 0, index = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }

    private static int removeElements(int[] nums, int val) {
        int[] arr = new int[]{};
        int index = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
//                arr[index] = nums[i];
                arrayList.add(nums[i]);
//                index++;
            }
        }
        return arrayList.size();
    }

    // in place
    public int removeElementAccepted(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


}