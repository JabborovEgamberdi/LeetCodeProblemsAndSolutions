package NotFinished;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class N_1002 {

    public static void main() {
        String[] words = {"bella", "label", "roller"};
        System.out.println(new N_1002().commonChars(words));
    }

    public List<String> commonChars(String[] words) {
        int[] arr = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                arr[c - 'a']++;
            }
        }
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            map.put(i, String.valueOf(words[0].charAt(i)));
        }

        List<String> strs = new LinkedList<>();
        for (int i = 1; i < words.length; i++) {
            strs.add(words[i]);
        }

        List<String> result = new LinkedList<>();
//        for (int i = 0; i < arr.length; i++) {
//            boolean isContains = true;
//            for (int j = 0; j < strs.size(); j++) {
//                if (!strs.get(j).contains(arr[i])) {
//                    isContains = false;
//                    break;
//                }
//            }
//            if (isContains) result.add(arr[i]);
//        }
        return result;
    }

    public List<String> commonChars3(String[] words) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < words[0].length(); i++) {
            map.put(i, String.valueOf(words[0].charAt(i)));
        }

        List<String> strs = new LinkedList<>(Arrays.asList(words).subList(1, words.length));

        List<String> result = new LinkedList<>();
        for (int i = 0; i < map.size(); i++) {
            boolean isContains = true;
            for (String str : strs) {
                if (!str.contains(map.get(i))) {
                    isContains = false;
                    break;
                }
            }
            if (isContains) result.add(map.get(i));
        }
        return result;
    }

    public List<String> commonChars2(String[] words) {
        List<String> result = new LinkedList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            int min = Integer.MAX_VALUE;
            for (String word : words) {
                int index = word.indexOf(c);
                if (index != -1) {
                    min = Math.min(min, index);
                }
            }
            for (int i = 0; i < min; i++) {
                result.add(Character.toString(c));
            }
        }
        return result;
    }
}
