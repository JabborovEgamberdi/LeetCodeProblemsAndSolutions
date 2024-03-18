package NotFinished;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/*
* Level: 🟢🟢🟢
* Status: not done
*/
public class N_387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar1("loveleetcode"));
        System.out.println(firstUniqChar1("aabb"));
        System.out.println(firstUniqChar1("a"));
        System.out.println(firstUniqChar1("aa"));
        System.out.println(firstUniqChar1("aadadaad"));
        System.out.println(firstUniqChar1("leetcode"));
        System.out.println(firstUniqChar2("aabbc"));
        System.out.println(firstUniqChar1("aabbccddeeff"));
        System.out.println(firstUniqChar1("aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"));
    }

    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                return i;
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        Set<Character> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.add(s.charAt(i))) {
                index++;
            } else break;
        }

        String s2 = s.substring(0, index);
        for (int i = 0; i < s2.length(); i++) {
            boolean isUnique = true;
            for (int j = index; j < s.length(); j++) {
                if (s2.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                return i;
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        Hashtable<Integer, Character> hashtable = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            hashtable.put(i, s.charAt(i));
        }
        for (int i = 0; i < hashtable.size(); i++) {

        }
        return hashtable.isEmpty() ? -1 : 0;
    }

}
