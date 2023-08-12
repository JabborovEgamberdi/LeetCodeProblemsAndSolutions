/*

    Problem:
  2413.  Smallest Even Multiple

  Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

    Level:
  Easy

    Result:
  Successfully finished with runtime 0 ms, memory 38.90 mb

    Time Complexity:
   O (1);

*/

public class Smallest_Even_Multiple_2413 {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(23));
        System.out.println(smallestEvenMultiple(44));
        System.out.println(smallestEvenMultiple(17));
    }
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {return n;};
        return n * 2;
    }

}