import java.util.Arrays;
import java.util.HashSet;

public class Contains_Duplicate_217 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        boolean b = containsDuplicate(nums);
        System.out.println(STR."b = \{b}");
        Arrays.sort(nums);
        Object[] array = new int[][]{Arrays.stream(nums).distinct().toArray()};
        System.out.println(STR."Arrays.deepToString(array) = \{Arrays.deepToString(array)}");
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : nums) {
            result.add(num);
        }
        return result.size() != nums.length;
    }

    public static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : nums) {
            if (!result.add(num)) {
                return true;
            } else {
                result.add(num);
            }
        }
        int[][] arr = new int[2][2];
        int[] arr1 = new int[]{0,1};
        return false;
    }

}