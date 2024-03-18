import java.util.Arrays;

public class Duplicate_Zeros_1089 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros1(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {0, 0, 0};
        duplicateZeros(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        duplicateZeros(arr4);
        System.out.println(Arrays.toString(arr4));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j >= i + 2; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }
    }

    public static void duplicateZeros1(int[] arr) {

        int n = arr.length;
        int possibleDups = 0;

        for (int j : arr) {
            if (j == 0) {
                possibleDups++;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (i + possibleDups < n) {
                    arr[i + possibleDups] = 0;
                }
                possibleDups--;
                if (i + possibleDups < n) {
                    arr[i + possibleDups] = 0;
                }
            } else {
                if (i + possibleDups < n) {
                    arr[i + possibleDups] = arr[i];
                }
            }
        }

    }



}