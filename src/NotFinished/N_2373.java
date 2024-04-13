package NotFinished;

import java.util.Arrays;

public class N_2373 {
    public static void main(String[] args) {
        int[][] grid = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        System.out.println(Arrays.deepToString(largestLocal(grid)));

    }

    static int indexRow = 0;
    static int indexCol = 0;

    public static int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length - 2][grid.length - 2];
        int index = grid.length - 2;
        for (int i = 0; i < grid.length - 2; i++) {
            int[] max = findMax(i, index + 2, grid);
            result[max[1]][i] = max[0];
        }
        return result;
    }

    public static int[] findMax(int start, int end, int[][] grid) {
        int[] result = new int[2];
        int max = 0;
        for (int i = start; i < end; i++) {
            for (int j = i; j < grid[i].length; j++) {
                if (grid[i][j] > max) max = grid[i][j];
            }
        }
        result[0] = max;
        result[1] = indexRow++;
        return result;
    }
}