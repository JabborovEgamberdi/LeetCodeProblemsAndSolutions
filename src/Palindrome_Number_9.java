/*

    Problem:
  9. Palindrome Number
  Given an integer x, return true if x is a palindrome, and false otherwise.

    Level:
  Easy

    Result:
  Successfully finished with runtime 9 ms, memory 42.60 mb

    Time Complexity:
  both of the first and second logics: O (n);
                     n - length of input integer;

*/
public class Palindrome_Number_9 {
    public static void main(String[] args) {
        System.out.println(STR."isPalindrome(357) = \{isPalindrome(357)}");
        System.out.println(STR."isPalindrome(454) = \{isPalindrome(454)}");
        System.out.println(STR."isPalindrome2(545) = \{isPalindrome2(456654)}");
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int res = 0;
        while (x > res) {
            res += res * 10 + x % 10;
            x = x / 10;
        }
        return x == res / 10;
    }

    public static boolean isPalindrome2(int x) {
        String value = String.valueOf(x);
        char start = value.charAt(0);
        char end = value.charAt(value.length() - 1);
        if (x > 10 && x < 100) {
            if (start == end) {
                return true;
            }
        }
        int i = 0;
        int j = value.length() - 1;
        while (start == end) {
            start = value.charAt(i);
            end = value.charAt(j);
            i++;
            j--;
            if (i == j) {
                return true;
            }
            if (i > j) {
                return value.charAt(i) == value.charAt(j);
            }
        }
        return false;
    }

}