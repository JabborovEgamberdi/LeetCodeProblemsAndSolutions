/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* Runtime: 0 ms, faster than 100.00% of Java online submissions for Check if Word Equals Summation of Two Words.
* */
public class N_1880 {

    public static void main(String[] args) {

        System.out.println(isSumEqual1("acb", "cba", "cdb"));
        System.out.println(isSumEqual2("acb", "cba", "cdb"));

    }

    public static boolean isSumEqual1(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb = new StringBuilder();
        for (char c : firstWord.toCharArray()) {
            sb.append(c - 'a');
        }
        int num1 = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        for (char c : secondWord.toCharArray()) {
            sb.append(c - 'a');
        }
        int num2 = Integer.parseInt(sb.toString());
        sb = new StringBuilder();
        for (char c : targetWord.toCharArray()) {
            sb.append(c - 'a');
        }
        int num3 = Integer.parseInt(sb.toString());
        return num1 + num2 == num3;
    }

    public static boolean isSumEqual2(String firstWord, String secondWord, String targetWord) {
        int num1 = sum(firstWord);
        int num2 = sum(secondWord);
        int num3 = sum(targetWord);
        return num1 + num2 == num3;
    }

    private static int sum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum * 10 + str.charAt(i) - 'a';
        }
        return sum;
    }

}
