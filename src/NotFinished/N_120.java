package NotFinished;

import java.util.Arrays;
import java.util.List;

public class N_120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (int i = 0; i < triangle.size(); i++) {
            int min = triangle.get(i).getFirst();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (min > triangle.get(i).get(j)) {
                    min = triangle.get(i).get(j);
                }
            }
            sum += min;
//            if (i != triangle.size() - 1) {
//                triangle.removeFirst();
//                minimumTotal(triangle);
//            }
        }
        return sum;
    }


    public static int minimumTotal1(List<List<Integer>> triangle) {
        int[] arr;
        int[] arr1 = new int[]{1, 2, 3};
        arr = arr1;
        Arrays.stream(arr).sum();
        int sum = 0;
        int index = 0;
        while (index < triangle.size()) {
            return sum;
        }
        return sum;
    }
}
