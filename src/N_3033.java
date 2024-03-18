import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n^2)
* Space Complexity: O(1)
* Runtime: 1 ms --> faster than 100%
* */
public class N_3033 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, -1}, {4, -1, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(modifiedMatrix2(matrix)));
    }

    public static int[][] modifiedMatrix(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            List<Integer> indexes = new LinkedList<>();
            boolean hasNegative = false;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) max = matrix[j][i];
                if (matrix[j][i] == -1) {
                    indexes.add(j);
                    hasNegative = true;
                }
            }
            if (hasNegative) {
                setMax(max, i, indexes, matrix);
            }
            max = 0;
        }
        return matrix;
    }

    private static void setMax(int max, int column, List<Integer> rows, int[][] matrix) {
        for (int num : rows) {
            matrix[column][num] = max;
        }
    }

    //1 m --> 100 %
    public static int[][] modifiedMatrix2(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            boolean hasNegative = false;
            for (int[] ints : matrix) {
                if (ints[i] > max) max = ints[i];
                if (ints[i] == -1) {
                    hasNegative = true;
                }
            }
            if (hasNegative) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[j][i] == -1) {
                        matrix[j][i] = max;
                    }
                }
            }
            max = 0;
        }
        return matrix;
    }

}