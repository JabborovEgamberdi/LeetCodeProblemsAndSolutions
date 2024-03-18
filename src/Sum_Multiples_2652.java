/*

    Level: MEDIUM 🟢🟢🟢

    Result:
  Successfully finished with runtime 2 ms
  23.45% of solutions used 2 ms of runtime

    Time Complexity: O (n);
                     n - length of input string;

*/
public class Sum_Multiples_2652 {

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
        System.out.println(sumOfMultiples(100));
        System.out.println(sumOfMultiples(1000));
    }

    public static int sumOfMultiples(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                result += i;
            }
        }
        return result;
    }

}