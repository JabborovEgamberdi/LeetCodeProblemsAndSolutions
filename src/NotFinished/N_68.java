package NotFinished;

import java.util.LinkedList;
import java.util.List;

public class N_68 {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        System.out.println(fullJustify(words, maxWidth));
        System.out.println(fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16));
        System.out.println(fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20));
        System.out.println(fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 21));
        System.out.println(fullJustify(new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 22));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new LinkedList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder append = str.append(words[i]).append(" ");
            if (append.length() - 1 > maxWidth) {
                int index = str.length() - words[i].length() - 1;
                result.add(str.substring(0, index));
                str = new StringBuilder();
                i--;
            }
        }
        return result;
    }
}
