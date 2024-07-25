import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* TimeComplexity: O (n ^ 2)
* Runtime: 0 ms --> 100 %
* */
public class N_500 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
    static public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> strs = new LinkedList<>();
        for (String word : words) {
            if (row1.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                if (isValid(word.toLowerCase(), row1)) {
                    strs.add(word);
                }
            }
            if (row2.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                if (isValid(word.toLowerCase(), row2)) {
                    strs.add(word);
                }
            }
            if (row3.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                if (isValid(word.toLowerCase(), row3)) {
                    strs.add(word);
                }
            }
        }

        String[] result = new String[strs.size()];
        for (int i = 0; i < strs.size(); i++) {
            result[i] = strs.get(i);
        }
        return result;
    }

    static boolean isValid(String word, String row) {
        for (char ch : word.toCharArray()) {
            if (row.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
