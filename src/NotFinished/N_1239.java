package NotFinished;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class N_1239 {
    public static void main(String[] args) {
        System.out.println(maxLength(new ArrayList<>(List.of("un", "iq", "le"))));
        System.out.println(maxLength(new ArrayList<>(List.of("cha", "r", "act", "ers"))));
        System.out.println(maxLength(new ArrayList<>(List.of("aa", "bb"))));
        System.out.println(maxLength(new ArrayList<>(List.of("ay", "fhmyf"))));
        System.out.println(maxLength(new ArrayList<>(List.of("abcdefghijklmnopqrstuvwxyz"))));
        System.out.println(maxLength(new ArrayList<>(List.of("a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"))));
    }

    public static int maxLength(List<String> arr) {
        HashSet<String> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            String word = arr.get(i);
            HashSet<String> set2 = new HashSet<>();
            for (int j = 0; j < word.length(); j++) {
                if (!set.add(word.substring(j, j + 1))) {
                    set.removeAll(set2);
                    break;
                }
                set2.add(word.substring(j, j + 1));
            }
            max = Math.max(max, set.size());
        }
        return max;
    }

    public static int maxLength2(List<String> arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > max) {
                String str = arr.get(i);
                HashSet<String> set = new HashSet<>();
                for (int j = 0; j < str.length(); j++) {
                    set.add(str.substring(j, j + 1));
                    if (j == str.length() - 1 &&
                            str.length() == set.size()) {
                        max = arr.get(i).length();
                        index = i;
                    }
                }

            }
        }
        arr.remove(index);
        int max2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > max2) {
                String str = arr.get(i);
                HashSet<String> set = new HashSet<>();
                for (int j = 0; j < str.length(); j++) {
                    set.add(str.substring(j, j + 1));
                    if (j == str.length() - 1 &&
                            str.length() == set.size()) {
                        max2 = arr.get(i).length();
                    }
                }
            }
        }
        return max + max2;
    }

}
