/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Runtime 0 ms Beats 100.00% of users with Java
* */
public class N_1816 {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
    }

    public static String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
                if (k <= 0) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}
