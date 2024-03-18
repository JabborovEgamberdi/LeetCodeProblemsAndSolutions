package NotFinished;

import java.util.LinkedList;
import java.util.List;

public class N_3026 {

    public static void main(String[] args) {

        System.out.println(maximumSubarraySum(new int[]{1, 2, 3, 4, 5, 6}, 1));
        System.out.println(maximumSubarraySum(new int[]{-1, 3, 2, 4, 5}, 3));
        System.out.println(maximumSubarraySum(new int[]{-1, -2, -3, -4}, 2));

        System.out.println(maximumSubarraySum2(new int[]{1, 2, 3, 4, 5, 6}, 1));
        System.out.println(maximumSubarraySum2(new int[]{-1, 3, 2, 4, 5}, 3));
        System.out.println(maximumSubarraySum2(new int[]{-1, -2, -3, -4}, 2));

        System.out.println(maximumSubarraySum3(new int[]{-1, 3, 2, 4, 5}, 3));
        System.out.println(maximumSubarraySum3(new int[]{1, 2, 3, 4, 5, 6}, 1));
        System.out.println(maximumSubarraySum3(new int[]{-1, -2, -3, -4}, 2));

//        System.out.println(maximumSubarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
//        System.out.println(maximumSubarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 0));
//        System.out.println(maximumSubarraySum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, -1));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        List<int[]> goodSubarray = new LinkedList<>();
        int inn = 0;
        int start = nums[inn];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int difference = nums[i] - start;
            if (Math.abs(difference) == k) {
                int[] arr = new int[i - index + 1];
                int in = 0;
                for (int j = index; j <= i; j++) {
                    arr[in] = nums[j];
                    in++;
                }
                goodSubarray.add(arr);
                start = nums[++inn];
                index++;
            }
        }
        return findMax(goodSubarray);
    }

    public static long maximumSubarraySum2(int[] nums, int k) {
        List<int[]> goodSubarray = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int difference = nums[j] - nums[i];
                int index = 0;
                if (Math.abs(difference) == k) {
                    int[] arr = new int[j - i + 1];
                    for (int l = i; l <= j; l++) {
                        arr[index] = nums[l];
                        index++;
                    }
                    goodSubarray.add(arr);
                }
            }
        }
        return findMax(goodSubarray);
    }

    private static int findMax(List<int[]> goodSubarray) {
        int max = 0;
        if (goodSubarray.isEmpty()) return max;
        int[] def = goodSubarray.getFirst();
        for (int j : def) {
            max += j;
        }

        for (int i = 1; i < goodSubarray.size(); i++) {
            int sum = 0;
            int[] arr = goodSubarray.get(i);
            for (int k : arr) {
                sum += k;
            }
            if (sum > max) max = sum;
        }
        return max;
    }

    public static long maximumSubarraySum3(int[] nums, int k) {
        List<int[]> goodSubarray = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                long difference = nums[j] - nums[i];
                if (Math.abs(difference) == k) {
                    int[] arr = new int[2];
                    arr[0] = i;
                    arr[1] = j;
                    goodSubarray.add(arr);
                }
            }
        }
        return findMax3(goodSubarray, nums);
    }

    private static long findMax3(List<int[]> goodSubarray, int[] nums) {
        long max = 0;
        if (goodSubarray.isEmpty()) return max;
        int[] def = goodSubarray.getFirst();
        for (int i = def[0]; i <= def[1]; i++) {
            max += nums[i];
        }
        for (int i = 1; i < goodSubarray.size(); i++) {
            long sum = 0;
            int[] arr = goodSubarray.get(i);
            for (int j = arr[0]; j <= arr[1]; j++) {
                sum += nums[j];
            }
            if (sum > max) max = sum;
        }
        return max;
    }

    //---------------------------------//
    public long maximumSubarraySum44(int[] nums, int k) {
        List<long[]> goodSubarray = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                long difference = nums[j] - nums[i];
                int index = 0;
                if (Math.abs(difference) == k) {
                    long[] arr = new long[j - i + 1];
                    for (int l = i; l <= j; l++) {
                        arr[index] = nums[l];
                        index++;
                    }
                    goodSubarray.add(arr);
                }
            }
        }
        return findMax44(goodSubarray);
    }

    private long findMax44(List<long[]> goodSubarray) {
        long max = 0;
        if (goodSubarray.isEmpty()) return max;
        long[] def = goodSubarray.getFirst();
        for (long j : def) {
            max += j;
        }

        for (int i = 1; i < goodSubarray.size(); i++) {
            long sum = 0;
            long[] arr = goodSubarray.get(i);
            for (long k : arr) {
                sum += k;
            }
            if (sum > max) max = sum;
        }
        return max;
    }


}