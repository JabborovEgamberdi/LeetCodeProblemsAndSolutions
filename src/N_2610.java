import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class N_2610 {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[]{1, 2, 3, 4}));
        System.out.println(findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> arr = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean isTrue = false;
            if (set.add(num)) {
                arr.add(num);
                isTrue = true;
            }
            if (!isTrue) {
                result.add(arr);
                arr = new LinkedList<>();
                set = new HashSet<>();
                set.add(num);
                arr.add(num);
            }
        }
        if (result.isEmpty()) result.add(arr);
        return result;
    }
}
