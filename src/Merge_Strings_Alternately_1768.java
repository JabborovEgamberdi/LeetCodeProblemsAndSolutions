/*

    Level: EASY 🟢🟢🟢

    Result:
    First Solution
  Successfully finished with runtime 1 ms
  Beats 82.81% of users with Java
  48.36% of solutions used 1 ms of runtime

    Second Solution
  Successfully finished with runtime 0 ms
  Beats 100% of users with Java
  17.19% of solutions used 0 ms of runtime

    Time Complexity:
       first way: O (n);
       second way: O (n)

*/
public class Merge_Strings_Alternately_1768 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately1("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int index1 = 0;
        int index2 = 0;
        int length = Math.max(word1.length(), word2.length());
        while (length > 0) {
            if (word1.length() > index1) {
                result.append(word1.charAt(index1));
                index1++;
            }
            if (word2.length() > index2) {
                result.append(word2.charAt(index2));
                index2++;
            }
            length--;
        }
        return result.toString();
    }

    public static String mergeAlternately1(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int length = Math.max(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() == word2.length()) {
            return result.toString();
        } else if (word1.length() > word2.length()) {
            return result.append(word1.substring(length)).toString();
        } else {
            return result.append(word2.substring(length)).toString();
        }
    }
}
