/*

    Problem:
  263. Ugly Number
  An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
  Given an integer n, return true if n is an ugly number.

    Level:
  Easy

    Result:
  Successfully finished with runtime 1 ms, beats 100

    Time Complexity:
       most case: O (1);

*/

public class Ugly_Number_263 {
    public static void main(String[] args) {
        System.out.println("isUgly(5) = " + isUgly(5));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }

}