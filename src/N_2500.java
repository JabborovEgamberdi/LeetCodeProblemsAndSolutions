import java.util.Arrays;

// Done
public class N_2500 {
    public static void main(String[] args) {

        int[][] grid = {{1, 2, 4}, {3, 3, 1}};
        System.out.println(deleteGreatestValue(grid));

        int[][] grid2 = {{10, 10}, {1, 1}, {4, 4}, {7, 7}};
        System.out.println(deleteGreatestValue(grid2));

        int[][] grid3 = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        System.out.println(deleteGreatestValue(grid3));

        int[][] grid4 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        System.out.println(deleteGreatestValue(grid4));
    }

    public static int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        int count = 0;
        int index = 0;
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max) {
                    max = grid[j][i];
                }
            }
            count += max;
            index++;
        }
        return count;
    }

}
