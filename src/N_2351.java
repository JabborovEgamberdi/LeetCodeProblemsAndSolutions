import java.util.HashSet;
import java.util.Set;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n)
* */
void main() {
    System.out.println(repeatedCharacter("abccbaacz"));
}

public static char repeatedCharacter(String s) {
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()) {
        if (!set.add(c)) {
            return c;
        }
    }
    return s.charAt(0);
}