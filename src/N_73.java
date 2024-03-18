import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟡🟡🟡
* Status: DONE
* Time Complexity: O(n2) --> 1 ms
* */
public class N_73 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrix1 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix1);
        System.out.println(Arrays.deepToString(matrix1));
    }

    public static void setZeroes(int[][] matrix) {
        List<int[]> indexes = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    int[] in = {i, j};
                    indexes.add(in);
                }
            }
        }
        setZeroesM(matrix, indexes);
    }

    private static void setZeroesM(int[][] matrix, List<int[]> indexes) {
        for (int j = 0; j < indexes.size(); j++) {
            int[] index = indexes.get(j);
            setZeroes(matrix, index[0], index[1]);
        }
    }

    private static void setZeroes(int[][] matrix, int row, int column) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }
}
