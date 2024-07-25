package NotFinished;

public class N_409 {
    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == arr[right]) {
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}
