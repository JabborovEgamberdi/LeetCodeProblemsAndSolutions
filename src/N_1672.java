public class N_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        System.out.println(maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println(maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int[] account : accounts) {
            int count = 0;
            for (int i : account) {
                count += i;
            }
            if (count > result) result = count;
        }
        return result;
    }
}
