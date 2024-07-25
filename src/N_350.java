import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O (n)
* Space Complexity: O (n)
* Runtime:  1 ms, faster than 99.53% of Java online submissions for Intersection of Two Arrays II.
* Memory Usage: 39.3 MB, less than 79.32% of Java online submissions for Intersection of Two Arrays II.

* Description:
* Given two arrays, write a function to compute their intersection.
*
* */
public class N_350 {

    public static void main() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        System.out.println(Arrays.toString(intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }

}