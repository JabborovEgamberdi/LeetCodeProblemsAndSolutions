import java.util.Arrays;

public class Rank_Transform_of_an_Array_1331 {
    public static void main(String[] args) {
        int[] nums = {40, 10, 20, 30};
        int[] result = arrayRankTransform(nums);
        String result_str = Arrays.toString(result);// [4, 1, 2, 3] (the ranks of the elements)
        System.out.println(STR."result = \{result_str}");
        int[] nums2 = {100, 100, 100};
        int[] result2 = arrayRankTransform(nums2);
        String result2_str = Arrays.toString(result2);// [1, 1, 1] (the ranks of the elements)
        System.out.println(STR."result2 = \{result2_str}");
        int[] nums3 = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        int[] result3 = arrayRankTransform(nums3);
        String result3_str = Arrays.toString(result3);// [5, 3, 4, 2, 8, 6, 7, 1, 3] (the ranks of the elements)
        System.out.println(STR."result3 = \{result3_str}");
        int[] nums4 = {27, 46, -3, -36, 31, -14, -7, -36, 27, -14, 41, -40, 23};
        int[] result4 = arrayRankTransform(nums4);
        String result4_str = Arrays.toString(result4);// [7, 10, 5, 2, 8, 3, 4, 2, 7, 3, 9, 1, 6] (the ranks of the elements)
        System.out.println(STR."result4 = \{result4_str}");
    }

    private static int[] arrayRankTransform(int[] arr) {
        int[] nums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int lessThan = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    lessThan++;
                }
            }
            nums[i] = lessThan;
        }
        return nums;
    }

}