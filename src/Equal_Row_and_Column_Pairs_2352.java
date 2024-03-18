import java.util.Arrays;

public class Equal_Row_and_Column_Pairs_2352 {
    public static void main(String[] args) {

        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(STR."first: \{equalPairs(grid)}");
        System.out.println(STR."second: \{equalPairs2(grid)}");

        int[][] grid2 = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(STR."first: \{equalPairs(grid2)}");
        System.out.println(STR."second: \{equalPairs(grid2)}");

    }

    public static int equalPairs(int[][] grid) {
        int[][] grid2 = new int[grid.length * 2][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int index = 0;
            while (index < grid[i].length) {
                grid2[i][index] = grid[index][i];
                index++;
            }
        }
        int in = 0;
        for (int i = grid.length; i < grid2.length; i++) {
            grid2[i] = grid[in];
            in++;
        }
        System.out.println(STR."grid: \{Arrays.deepToString(grid)}");
        System.out.println(STR."grid2: \{Arrays.deepToString(grid2)}");

        int count = 0;
        for (int i = 0; i < grid2.length; i++) {
            if (grid2[i] == null) continue;
            int[] arr = grid2[i];
            for (int j = i + 1; j < grid2.length; j++) {
                if (grid2[j] == null) {
                    continue;
                }
                int[] arr2 = grid2[j];
                int index = 0;
                boolean isEqual = false;
                while (index < arr.length) {
                    if (arr[index] == arr2[index]) {
                        isEqual = true;
                    } else {
                        break;
                    }
                    if (index == arr.length - 1 && isEqual == true && arr[arr.length - 1] == arr2[arr2.length - 1]) {
                        count++;
                        grid2[j] = null;
                        break;
                    }
                    index++;
                }
            }
        }
        System.out.println(STR."grid2: \{Arrays.deepToString(grid2)}");

        return count;
    }

    public static int equalPairs2(int[][] grid) {
        int[][] grid2 = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int index = 0;
            while (index < grid[i].length) {
                grid2[i][index] = grid[index][i];
                index++;
            }
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] arr = grid[i];
            for (int j = 0; j < grid2.length; j++) {
                int[] arr2 = grid2[j];
                int index = 0;
                boolean isEqual = false;
                while (index < arr.length) {
                    if (arr[index] == arr2[index]) {
                        isEqual = true;
                    } else {
                        break;
                    }
                    if (index == arr.length - 1 && isEqual == true
                            && arr[arr.length - 1] == arr2[arr2.length - 1]) {
                        count++;
                        break;
                    }
                    index++;
                }
            }
        }
        return count;
    }


}