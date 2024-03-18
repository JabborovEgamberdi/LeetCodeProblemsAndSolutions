package NotFinished;

import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Runtime: 8 ms, faster than 7.00% of Java online submissions for Intersection of Two Arrays.
* */
public class N_349 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!list.contains(nums1[i])) {
                        list.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
}
