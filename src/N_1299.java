/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O(n ^ 2)
 * Runtime: 4 ms --> 31.49 %
 * */

import java.util.Arrays;

void main() {
    System.out.println(Arrays.toString(replaceElements1(new int[]{17, 18, 5, 4, 6, 1})));
    System.out.println(Arrays.toString(replaceElements(new int[]{400})));
}

// 4 ms --> 31.49%
public static int[] replaceElements(int[] arr) {
    if (arr.length == 1)
        return new int[]{-1};
    int[] max = getMax(0, arr);
    for (int i = 0; i < arr.length; i++) {
        if (i < max[1]) {
            arr[i] = max[0];
        } else if (i == arr.length - 1) {
            arr[i] = -1;
        } else {
            max = getMax(i + 1, arr);
            arr[i] = max[0];
        }
    }
    return arr;
}

private static int[] getMax(int index, int[] arr) {
    int max = 0;
    int ind = 0;
    for (int i = index; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            ind = i;
        }
    }
    return new int[]{max, ind};
}

public static int[] replaceElements1(int[] arr) {
    if (arr.length == 1)
        return new int[]{-1};
    int max = getMax1(0, arr);
    for (int i = 0; i < arr.length; i++) {
        if (i < max) {
            arr[i] = arr[max];
        } else if (i == arr.length - 1) {
            arr[i] = -1;
        } else {
            max = getMax1(i + 1, arr);
            arr[i] = arr[max];
        }
    }
    return arr;
}

private static int getMax1(int index, int[] arr) {
    int max = 0;
    int ind = 0;
    for (int i = index; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            ind = i;
        }
    }
    return ind;
}