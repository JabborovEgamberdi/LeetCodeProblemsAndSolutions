package NotFinished;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class N_2708 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one.two.three", "four.five", "six");
        System.out.println(splitWordsBySeparator1(words, '.'));
        System.out.println(splitWordsBySeparator(words, '$'));
        System.out.println(splitWordsBySeparator(words, ' '));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String regex = Pattern.quote(String.valueOf(separator));
            String[] strings = word.split(regex);
            result.addAll(Arrays.asList(strings));
        }
        return result;
    }

    public static List<String> splitWordsBySeparator1(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            int index = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == separator) {
                    String string = word.substring(index, i);
                    result.add(string);
                    index = i;
                }
            }
        }
        return result;
    }
}
