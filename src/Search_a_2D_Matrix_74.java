public class Search_a_2D_Matrix_74 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 1));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix2(matrix, 3));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 13));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 60));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 1));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix2(matrix, 23));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 34));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 10));
        System.out.println(new Search_a_2D_Matrix_74().searchMatrix(matrix, 11));

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[i].length - 1] < target) continue;
            if (matrix[i][matrix[i].length - 1] == target) return true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][matrix[i].length - 1] > target) {
                    int[] arr = matrix[i];
                    int start = 0;
                    int end = arr.length;
                    while (start <= end) {
                        if (arr[arr.length / 2] > target) {
                            end = arr.length / 2;
                        } else if (arr[arr.length / 2] < target) {
                            start = arr.length / 2;
                        } else if (arr[arr.length / 2] == target) {
                            return true;
                        }
                        if (arr[start] == target) return true;
                        if (arr[end] == target) return true;
                        start++;
                        end--;
                    }
                } else break;
            }
        }
        return false;
    }

    // O(log(n * m)) --> 0 ms --> 100 %
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}