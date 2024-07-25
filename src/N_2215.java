import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O (n)
 * Space Complexity: O (n)
 * Runtime: 10 ms, faster than 77.61% of Java online submissions for Find the Difference of Two Arrays.
 * */
void main() {
    int[] nums1 = {1, 2, 3};
    int[] nums2 = {2, 4, 6};
    System.out.println(findDifference(nums1, nums2));
}

public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ans1 = new ArrayList<>();
    List<Integer> ans2 = new ArrayList<>();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for (int n : nums1) set1.add(n);
    for (int n : nums2) set2.add(n);
    for (int n : set1) {
        if (!set2.contains(n)) {
            ans1.add(n);
        }
    }
    for (int n : set2) {
        if (!set1.contains(n)) {
            ans2.add(n);
        }
    }
    ans.add(ans1);
    ans.add(ans2);
    return ans;
}