/*
* Status: DONE
* Level: 🟢🟢🟢
*/

public class Arranging_Coins_441 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(10));
    }

    public static int arrangeCoins(int n) {
        int index = 1;
        int sum = 0;
        int count = 0;
        while (sum < n) {
            sum += index;
            index++;
            if (sum < n) {
                count++;
            }
        }
        return count;
    }

}
