import java.util.Arrays;

void main() {
    System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
}

public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
            if (nums1[i] == nums2[j]) {
                if (j < nums2.length - 1) {
                    if (nums1[i] < nums2[j + 1]) {
                        result[i] = nums2[j + 1];
                    } else {
                        result[i] = -1;
                    }
                } else {
                    result[i] = -1;
                }
            }
        }
    }
    return result;
}

public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        for (int j = 0; j < nums2.length; j++) {
            if (nums1[i] == nums2[j]) {
                if (j < nums2.length - 1) {
                    for (int k = j; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            result[i] = nums2[k];
                        }
                    }
                    if (result[i] == 0) {
                        result[i] = -1;
                    }
                }
            }
        }
    }
    return result;
}


