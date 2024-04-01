/*
* Status: DONE
* Level: 🟢🟢🟢
* Time Complexity: O(n ^ 2)
* Space Complexity: O(1)
 */
public class N_2965 {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        N_2965 n2965 = new N_2965();
        int[] result = n2965.findMissingAndRepeatedValues(grid);
        System.out.println(STR."\{result[0]} \{result[1]}");
        System.out.println(STR."\{result[0]} \{result[1]}");
    }

    // 1 ms --> 100 %
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        boolean[] result = new boolean[grid.length * grid[0].length + 1];
        int repeated = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (result[ints[j]]) repeated = ints[j];
                result[ints[j]] = true;
            }
        }
        int[] arr = new int[2];
        arr[0] = repeated;
        for (int i = 1; i < result.length; i++) {
            if (!result[i]) arr[1] = i;
        }
        return arr;
    }
}