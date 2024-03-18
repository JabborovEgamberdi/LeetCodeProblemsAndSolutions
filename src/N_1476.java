import java.util.Arrays;

/**
 * Status: DONE
 * Level: 🟡🟡🟡`
 * */
public class N_1476 {
    public static void main(String[] args) {

        int[][] arr =
                new int[][]{
                        {1, 2, 1},
                        {4, 3, 4},
                        {3, 2, 1},
                        {1, 1, 1}
                };
        SubRectangleQueries subrectangleQueries = new SubRectangleQueries(arr);
        System.out.println(STR."Arrays.deepToString(arr) = \{Arrays.deepToString(arr)}");
        System.out.println(STR."subrectangleQueries.getValue(0, 2) = \{subrectangleQueries.getValue(0, 2)}");
        subrectangleQueries.updateSubRectangle(0, 0, 3, 2, 5);
        System.out.println(STR."Arrays.deepToString(arr) = \{Arrays.deepToString(arr)}");
        System.out.println(STR."subrectangleQueries.getValue(0, 2) = \{subrectangleQueries.getValue(0, 2)}");
        System.out.println(STR."subrectangleQueries.getValue(3, 1) = \{subrectangleQueries.getValue(3, 1)}");
        subrectangleQueries.updateSubRectangle(3, 0, 3, 2, 10);
        System.out.println(STR."Arrays.deepToString(arr) = \{Arrays.deepToString(arr)}");
    }
}

// 0 ms
class SubRectangleQueries {

    int[][] rect;

    public SubRectangleQueries(int[][] rectangle) {
        rect = rectangle;
    }

    public void updateSubRectangle(
            int row1,
            int col1,
            int row2,
            int col2,
            int newValue
    ) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rect[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rect[row][col];
    }
}
