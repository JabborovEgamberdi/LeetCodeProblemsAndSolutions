/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Time Complexity: O (n * m)
 * Runtime: 1 ms Beats 100.00%
 * */

void main() {
    System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
}

private static String removeOccurrences(String s, String part) {
    while (true) {
        int index = s.indexOf(part);
        if (index == -1) return s;
        s = s.substring(0, index) + s.substring(index + part.length());
    }
}