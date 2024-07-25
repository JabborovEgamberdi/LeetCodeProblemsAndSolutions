/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * */

import java.util.HashSet;
import java.util.Set;

void main() {
    System.out.println(maximumSetSize(new int[]{1, 2, 3, 4, 5, 6}, new int[]{2, 3, 2, 3, 2, 3}));
    System.out.println(maximumSetSize2(new int[]{1, 1, 2, 2, 3, 3}, new int[]{4, 4, 5, 5, 6, 6}));
}

public static int maximumSetSize(int[] nums1, int[] nums2) {
    Set<Integer> s1 = new HashSet<>();
    for (int num : nums1) {
        s1.add(num);
    }
    Set<Integer> s2 = new HashSet<>();
    for (int num : nums2) {
        s2.add(num);
    }
    Set<Integer> result = new HashSet<>();
    int count = 0;
    for (int num : s1) {
        if (s2.contains(num)) {
            count++;
        }
        result.add(num);
    }
    for (int num : s2) {
        result.add(num);
    }
    if (count == 0) {
        int c1 = 0;
        if (s1.size() > nums1.length / 2) c1 = nums1.length / 2;
        else c1 = s1.size();
        int c2 = 0;
        if (s2.size() > nums2.length / 2) c2 = nums2.length / 2;
        else c2 = s2.size();
        return c1 + c2;
    }
    if (result.size() == s1.size() + s2.size()) {
        return result.size();
    }
    int max = Math.max(s1.size(), s2.size());
    int min = Math.min(s1.size(), s2.size());
    int cc = max - count;
    if (cc < nums1.length / 2) {
        if (max > nums1.length / 2 && cc < nums1.length / 2) {
            cc = nums1.length / 2;
        }
    }
    if (count == max) return count;
    if (cc > nums1.length / 2) {
        cc = nums1.length / 2;
    }
    int mm = 0;
    if (min > nums1.length / 2) {
        mm = nums1.length / 2;
    } else mm = min;
    return cc + mm;
}

// 18 ms --> 20%
public int maximumSetSize2(int[] nums1, int[] nums2) {
    Set<Integer> s1 = new HashSet<>();
    Set<Integer> s2 = new HashSet<>();
    Set<Integer> s3 = new HashSet<>();

    for (int num: nums1){
        s1.add(num);
        s3.add(num);
    }
    for (int num: nums2) {
        s2.add(num);
        s3.add(num);
    }

    return Math.min(Math.min(s1.size(), nums1.length/2) +
            Math.min(s2.size(), nums2.length/2), s3.size());
}