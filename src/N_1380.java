import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n ^ 2)
* Runtime: Beats 90 % of users with java
* */
public class N_1380 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(luckyNumbers(matrix));
        System.out.println(luckyNumbers2(matrix));
        System.out.println(luckyNumbers(new int[][]{{7, 8}, {1, 2}}));
        System.out.println(luckyNumbers2(new int[][]{{7, 8}, {1, 2}}));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }
            int max = min;
            for (int k = 0; k < matrix[i].length; k++) {
                if (max < matrix[k][i]) {
                    max = matrix[k][i];
                    break;
                }
            }
            if (min == max) result.add(max);
        }

        return result;
    }

    // 2 ms --> 90.32 %
    public static List<Integer> luckyNumbers2(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            int index = i;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
            }

            boolean isLucky = true;
            for (int[] ints : matrix) {
                if (matrix[i][index] < ints[index]) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(min);
            }
        }

        return result;
    }
}
