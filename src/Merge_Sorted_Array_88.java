import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge3(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(m);
        System.out.println(n);
    }

    // First Solution
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int m1 = m;
        for (int i = 0; i < nums1.length; i++) {
            if (m > 0) {
                result[i] = nums1[i];
                m--;
            } else if (m == 0) {
                break;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (n > 0) {
                result[m1] = nums2[i];
                n--;
                m1++;
            } else if (n == 0) {
                break;
            }
        }
        Arrays.sort(result);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
        System.out.println("Arrays.toString(nums2) = " + Arrays.toString(nums2));
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("k = " + k);
    }

    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            if (n > 0) {
                nums1[m] = nums2[i];
                n--;
                m++;
            } else if (n == 0) {
                break;
            }
        }
        Arrays.sort(nums1);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(nums1));
    }

}