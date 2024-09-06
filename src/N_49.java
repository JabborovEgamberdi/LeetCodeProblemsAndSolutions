import java.util.*;

/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Time Complexity: O(n)
 * Runtime: 6 ms -> Beats 97.97%
 * */
public class N_49 {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.toString(strs));
        groupAnagrams(strs).forEach(System.out::println);
        char a = '8';
        System.out.println(a);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        return new AbstractList<>() {
            List<List<String>> result;

            public List<String> get(int index) {
                if (result == null) {
                    init();
                }
                return result.get(index);
            }

            public int size() {
                if (result == null) {
                    init();
                }
                return result.size();
            }

            private void init() {
                for (String s: strs) {
                    char[] keys = new char[26];
                    for (int i = 0; i < s.length(); i++) {
                        keys[s.charAt(i) - 'a']++;
                    }

                    String key = new String(keys);
                    System.out.println(key);
                    List<String> list = map.get(key);
                    if (list == null) {
                        map.put(key, new ArrayList<>());
                    }

                    map.get(key).add(s);
                }
                result = new ArrayList<>(map.values());
            }
        };
    }

    // work
    public static List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) continue;
            char[] word = intoArray(strs[i]);
            List<String> anagrams = new ArrayList<>();
            for (int j = i; j < strs.length; j++) {
                if (strs[j] == null) continue;
                char[] chars = intoArray(strs[j]);
                boolean isAnagram = isAnagram(chars, word);
                if (isAnagram) {
                    anagrams.add(strs[j]);
                    strs[j] = null;
                }
            }
            groupAnagrams.add(anagrams);
        }
        return groupAnagrams;
    }

    private static boolean isAnagram(char[] chars, char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] != chars[i]) {
                return false;
            }
        }
        return true;
    }

    private static char[] intoArray(String str) {
        char[] word = new char[26];
        for (char c : str.toCharArray()) {
            word[c - 'a']++;
        }
        return word;
    }

    // 6 ms --> 99.6 %
    public List<List<String>> groupAnagrams3(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.get(key);
            if (list == null) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

}