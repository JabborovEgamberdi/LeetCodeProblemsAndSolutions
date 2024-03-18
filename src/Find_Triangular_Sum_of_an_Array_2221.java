
public class Find_Triangular_Sum_of_an_Array_2221 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(triangularSum(arr));
    }

    public static int triangularSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            result += (nums[i] + nums[i + 1]) % 10;
            if (result > 9) {
                result = result % 10;
            }
        }
        return result * 2;
    }

}