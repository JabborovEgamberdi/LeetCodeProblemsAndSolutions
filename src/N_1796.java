import java.util.LinkedList;
import java.util.List;

/*
 * Level: 🟢🟢🟢
 * Status: DONE
 * Time Complexity: O(n^2)
 * Runtime 3 ms Beats 50.00% of users with Java
 * */
public class N_1796 {
    public static void main(String[] args) {
        System.out.println(secondHighest("dfa12321afd"));
        System.out.println(secondHighest2("dfa12321afd"));
    }

    public static int secondHighest(String s) {
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                if (!list.contains(s.charAt(i))) {
                    list.add(s.charAt(i));
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < list.get(i)) {
                    char temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        if (list.size() < 2) return -1;
        return list.get(list.size() - 2) - '0';
    }

    // 0 ms --> from solutions
    public static int secondHighest2(String s) {
        int k = 2;
        System.out.println(s.indexOf('9'));
        for (char i = '9'; i >= '0'; i--) {
            if (s.indexOf(i) != -1) k--;
            if (k == 0) return i - '0';
        }
        return -1;
    }

}
