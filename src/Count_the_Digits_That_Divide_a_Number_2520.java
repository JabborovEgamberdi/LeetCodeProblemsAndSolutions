/*

    Level: EASY 🟢🟢🟢

    Result:
  Successfully finished with runtime 0 ms
  Beats 100% of users with Java
  86.75% of solutions used 0 ms of runtime

    Time Complexity:
       first way: O (n);
                     n - length of input string;
       second way: O (1)

*/
public class Count_the_Digits_That_Divide_a_Number_2520 {
    public static void main(String[] args) {
        System.out.println(STR."countDigits(5) = \{countDigits(5)}");
        System.out.println(STR."countDigits(7) = \{countDigits(7)}");
    }

    public static int countDigits(int num) {
        int count = 0;
        int n = num;
        while(n > 0){
            int digit = n % 10;
            if(num % digit == 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }

}