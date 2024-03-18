/*

    Problem:
  1342. Number of Steps to Reduce a Number to Zero
  Given an integer num, return the number of steps to reduce it to zero.
  In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

    Level:
  Easy

    Result:
  Runtime: 0 ms, faster than 100% of Java online submissions for Find Target Indices After Sorting Array
  90.75% of solutions used 55 ms of runtime

    Time Complexity: O(n)
                     n - is the value of the input integer;
    Space complexity: O(1)

*/

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_1342 {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
    }

    public static int numberOfSteps(int num) {
        int result = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            result++;
        }
        return result;
    }

}