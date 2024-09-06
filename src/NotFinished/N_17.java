import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Level: 🟡🟡🟡
* Status:
* */
void main() {
    System.out.println(letterCombinations("2"));
}

public static List<String> letterCombinations(String digits) {
    if (digits.isEmpty()) return List.of();
    Map<Character, String> letters = new HashMap<>();
    letters.put('2', "abc");
    letters.put('3', "def");
    letters.put('4', "ghi");
    letters.put('5', "jkl");
    letters.put('6', "mno");
    letters.put('7', "pqrs");
    letters.put('8', "tuv");
    letters.put('9', "wxyz");
    if (digits.length() == 1) {
        List<String> result = new ArrayList<>();
        String str = letters.get(digits.charAt(0));
        for (char c : str.toCharArray()) {
            result.add(c + "");
        }
        return result;
    }
    List<String> lettersCombination = new ArrayList<>();
    for (char c : digits.toCharArray()) {
        lettersCombination.add(letters.get(c));
    }

    return new ArrayList<>(letters.values());
}