import java.util.Arrays;

// done
public class Plus_One_66 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
    }

    public static int[] plusOne1(int[] digits) {
        if (digits[digits.length - 1] + 1 < 10) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        } else {
            int num = 1;
            digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
            for (int i = digits.length - 2; i >= 0; i--) {
                digits[i] = (digits[i] + num) % 10;
                num = (digits[i] + num) / 10;
            }
        }
        return digits;
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] == 9) {
            return new int[] { 1, 0 };
        }
        if (digits.length == 2 && digits[0] == 9  && digits[1] == 9) {
            return new int[] { 1, 0, 0 };
        }
        if (digits[digits.length - 1] + 1 < 10) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            int num = (digits[digits.length - 1] + 1) / 10;
            digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
            int sum = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                int temp = digits[i];
                digits[i] = (digits[i] + num) % 10;
                num = (temp + num) / 10;
                sum = temp + num;
            }
            if (sum > 9) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for (int i = 1; i < digits.length; i++) {
                    result[i] = digits[i];
                }
                return result;
            } else {
                return digits;
            }
        }
    }
}