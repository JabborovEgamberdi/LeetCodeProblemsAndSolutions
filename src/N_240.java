/*
* Level: 🟡🟡🟡
* Status: DONE
* Time Complexity: O(log n)
* Runtime: 5 ms -> faster than 99.95% of Java online submissions for Search Matrix 2.
* */
public class N_240 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 6;
        System.out.println(searchMatrix2(matrix, target));
        System.out.println(searchMatrix1(matrix, target));
    }

    // 5 ms --> 99.95%
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }

    // 10 ms
    public static boolean searchMatrix1(int[][] matrix, int target) {
        for (int[] nums : matrix) {
            for (int anInt : nums) {
                if (anInt == target) return true;
            }
        }
        return false;
    }

}