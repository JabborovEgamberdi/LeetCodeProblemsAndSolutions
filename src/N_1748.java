import java.util.HashSet;
import java.util.Set;
/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Runtime: 1 ms --> 75.04 ms
* */
void main() {
    System.out.println(sumOfUnique(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}));
}

public int sumOfUnique(int[] nums) {
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