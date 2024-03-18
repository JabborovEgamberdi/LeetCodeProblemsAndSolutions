import java.util.Arrays;

/*
* Level: 🟢🟢🟢
* Status: DONE
* TimeComplexity: O(n)
* Runtime: 0 ms Beats 100.00% of users with Java
* */
public class N_832 {
    public static void main(String[] args) {

        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));

        int[][] image2 = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(reverseAndFlip(image2)));

    }

    // 1 ms
    public static int[][] flipAndInvertImage(int[][] image) {
        reverse(image);
        invert(image);
        return image;
    }

    private static void reverse(int[][] image) {
        int index = 0;
        while (index < image.length) {
            int left = 0;
            int right = image[0].length - 1;
            int[] nums = image[index];
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            index++;
        }
    }

    private static void invert(int[][] image) {
        int index = 0;
        while (index < image.length) {
            int[] nums = image[index];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) nums[i] = 1;
                else if (nums[i] == 1) nums[i] = 0;
            }
            index++;
        }
    }

    // 0 ms
    private static int[][] reverseAndFlip(int[][] image) {
        int index = 0;
        while (index < image.length) {
            int left = 0;
            int right = image[0].length - 1;
            int[] nums = image[index];
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right] == 1 ? 0 : 1;
                nums[right] = temp == 1 ? 0 : 1;
                left++;
                right--;
            }
            index++;
        }
        return image;
    }

}