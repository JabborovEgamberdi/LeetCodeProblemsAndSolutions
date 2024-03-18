/*
    Time complexity: O(1)
    Space complexity: O(1)
    Runtime: 0 ms, faster than 100.0% of Java online submissions for Find Target Indices After Sorting Array.
    90.5% of solutions used 0 ms of runtime
    Level: 🟢🟢🟢
*/
public class A_Number_After_a_Double_Reversal_2119 {

    public static void main(String[] args) {
        int num = 526;
        System.out.println(new A_Number_After_a_Double_Reversal_2119().isSameAfterReversals(num));
    }

    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

}