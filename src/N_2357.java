import java.util.Arrays;

//done
public class N_2357 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 3, 5};
        System.out.println(minimumOperations1(nums));

        int[] nums1 = {0, 5};
        System.out.println(minimumOperations(nums1));
    }

    public static int minimumOperations(int[] nums) {
        if (nums.length == 1) return nums[0];
        Arrays.sort(nums);
        int[] arr = Arrays.stream(nums).distinct().toArray();
        int in = 0;
        int min = arr[in] == 0 ? arr[in++] : arr[in];
        int index = 0;
        int count = 0;
        while (arr[arr.length - 1] != 0 && in < arr.length) {
            while (index < arr.length) {
                arr[index] = arr[index] - min;
                index++;
            }
            index = 0;
            count++;
            min = arr[in++];
        }
        return count;
    }

    public static int minimumOperations1(int[] nums) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (min == 0) min = nums[i];
                min = Math.min(nums[i], min);
                max = Math.max(nums[i], max);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = nums[i] - min;
            }
        }
        int count = 0;
        max = max - min;
        if (max != 0) {
            count++;
            minimumOperations1(nums);
        }
        return count;
    }
}
