/**
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O(n)
 * Runtime: 0 ms --> 100%
 * */
public class N_867 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = transpose(matrix);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(STR."\{anInt} ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int mm = matrix[0].length;
        int[][] result = new int[mm][m];
        for (int i = 0; i < mm; i++) {
            int[] row = new int[m];
            for (int j = 0; j < m; j++) {
                row[j] = matrix[j][i];
            }
            result[i] = row;
        }
        return result;
    }
}
