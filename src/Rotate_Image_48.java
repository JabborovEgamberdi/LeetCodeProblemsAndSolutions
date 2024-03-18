/*

Level: 🟡🟡🟡
Time Complexity: O(n^2)
Space Complexity: O(1)

*/
public class Rotate_Image_48 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] rotate = rotate(matrix);
        System.out.println(STR."rotate = \{rotate}");

        int[][] matrix1 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        rotate(matrix1);

    }

    public static int[][] rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= i; j--) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix.length - 1;
            while (start <= end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

        return matrix;
    }

}