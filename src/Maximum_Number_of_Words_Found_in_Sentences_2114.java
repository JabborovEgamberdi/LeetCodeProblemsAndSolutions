import java.util.ArrayList;

public class Maximum_Number_of_Words_Found_in_Sentences_2114 {
    public static void main(String[] args) {
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };
        System.out.println(mostWordsFound(sentences));

        String[] sentences2 = {
                "please wait",
                "continue to fight",
                "continue to win"
        };
        System.out.println(mostWordsFound(sentences2));

        String[] sentences3 = {
                "a", "b", "c", "d", "e",
                "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"
        };
        System.out.println(mostWordsFound(sentences3));
    }

    public static int mostWordsFound(String[] sentences) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : sentences) {
            int result = 0;
            for (int j = 0; j < s.trim().length(); j++) {
                if (s.charAt(j) == ' ') {
                    result++;
                }
            }
            list.add(result + 1);
        }

        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            for (Integer integer : list) {
                if (max < integer) {
                    max = integer;
                }
            }
        }
        return max;
    }

}