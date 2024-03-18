package NotFinished;

import java.util.HashSet;
import java.util.Set;

public class N_1748 {
    public static void main(String[] args) {

    }

    public int sumOfUnique(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
                sum -= num;
            } else {
                set.add(num);
                sum += num;
            }
        }
        return sum;
    }

    public int sumOfUnique2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> removed = new HashSet<>();
        int sum = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
                removed.add(num);
                sum -= num;
            } else {
                if (!removed.contains(num)) {
                    set.add(num);
                    sum += num;
                }
            }
        }
        return sum;
    }
}
