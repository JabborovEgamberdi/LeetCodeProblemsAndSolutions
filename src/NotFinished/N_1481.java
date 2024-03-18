package NotFinished;

import java.util.HashSet;
import java.util.Set;

public class N_1481 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4};
        int k = 1;
        System.out.println(findLeastNumOfUniqueInts(arr, k));
        int[] arr1 = {2,4,1,8,3,5,1,3};
        int k1 = 3;
        System.out.println(findLeastNumOfUniqueInts1(arr1, k1));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (k >= 0) {
            end--;
            k--;
            if (k > 0) {
                start++;
                k--;
            }
        }
        Set<Integer> result = new HashSet<>();
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result.size();
    }

    public static int findLeastNumOfUniqueInts1(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (k >= 0) {
            start++;
            k--;
            if (k > 0) {
                end--;
                k--;
            }
        }
        Set<Integer> result = new HashSet<>();
        for (int i = start; i <= end; i++) {
            result.add(arr[i]);
        }
        return result.size();
    }

}