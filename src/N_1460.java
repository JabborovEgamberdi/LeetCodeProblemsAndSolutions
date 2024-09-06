void main() {
    System.out.println(canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
    System.out.println(canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}));
}

public static boolean canBeEqual(int[] target, int[] arr) {
    int[] targetElementCounts = countElements(target);
    int[] arrElementCounts = countElements(arr);
    return isEqual(targetElementCounts, arrElementCounts);
}

private static int[] countElements(int[] arr) {
    int[] nums = new int[1001];
    for (int num : arr)
        nums[num]++;
    return nums;
}

private static boolean isEqual(int[] target, int[] arr) {
    for (int i = 0; i < arr.length; i++)
        if (arr[i] != target[i])
            return false;
    return true;
}