import java.util.Arrays;

/*

    Level: MEDIUM 🟡

    Result:
  Successfully finished with runtime 0 ms

    Time Complexity:
       first way: O (n + m);
                     n - length of input string;
                     m - length of trimmed string;
       second way: O (1)

*/

public class Minimum_Operations_to_Make_Array_Equal_1551 {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(minOperations(n));
        n = 11;
        System.out.println(minOperations(n));
        n = 12;
        System.out.println(minOperations(n));
    }

    public static int minOperations(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
            sum += arr[i];
        }
        int average = sum / n;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(average - arr[i]);
            result += arr[i];
        }
        System.out.println(STR."Arrays.toString(arr) = \{Arrays.toString(arr)}");

        return result / 2;
    }

}