package NotFinished;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Level: 🟡🟡🟡
 * Status: not done
 */
public class N_56 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals2 = {{1, 4}, {4, 5}};
        System.out.println(STR."Arrays.deepToString(intervals) = \{Arrays.deepToString(merge(intervals))}");
        System.out.println(STR."Arrays.deepToString(intervals) = \{Arrays.deepToString(merge2(intervals))}");
        System.out.println(STR."Arrays.deepToString(intervals) = \{Arrays.deepToString(merge3(intervals))}");
        System.out.println(STR."Arrays.deepToString(intervals) = \{Arrays.deepToString(merge2(intervals2))}");
        System.out.println(STR."Arrays.deepToString(intervals) = \{Arrays.deepToString(merge3(intervals2))}");
    }

    public static int[][] merge(int[][] intervals) {
        int lenArr = intervals.length;
        int lenNums = intervals[0].length;
        int[][] result = new int[lenArr][lenNums];
        int index = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][lenNums - 1] > intervals[i + 1][0]) {
                result[i][0] = intervals[i][0];
                result[i][1] = intervals[i + 1][1];
                i++;
                index++;
            } else {
                result[i] = intervals[i];
                index++;
            }
        }
        return result;
    }

    public static int[][] merge2(int[][] intervals) {
        int lenArr = intervals.length;
        int lenNums = intervals[0].length;
        int[][] result = new int[lenArr][lenNums];
        int index = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][lenNums - 1] >= intervals[i + 1][0]) {
                result[index][0] = intervals[i][0];
                result[index][1] = intervals[i + 1][1];
                i++;
                index++;
            } else {
                result[index] = intervals[i];
                index++;
            }
        }

        if (result[index - 1][lenNums - 1] >= intervals[lenArr - 1][0]) {
            result[index - 1][0] = result[index - 1][0];
            result[index - 1][1] = intervals[lenArr - 1][1];
        } else {
            result[index] = intervals[lenArr - 1];
        }
        return result;
    }

    public static int[][] merge3(int[][] intervals) {
        int lenArr = intervals.length;
        int lenNums = intervals[0].length;
        List<int[]> result = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][lenNums - 1] >= intervals[i + 1][0]) {
                int[] temp = new int[2];
                temp[0] = intervals[i][0];
                temp[1] = intervals[i + 1][1];
                result.add(temp);
                i++;
                index++;
            } else {
                result.add(index, intervals[i]);
                index++;
            }
        }
        if (result.getLast()[lenNums - 1] >= intervals[lenArr - 1][0]) {
            int[] temp = new int[2];
            temp[0] = result.getLast()[0];
            temp[1] = intervals[lenArr - 1][1];
            result.remove(result.getLast());
            result.add(temp);
        } else {
            result.add(intervals[lenArr - 1]);
        }
        int[][] res = new int[result.size()][lenNums];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

}