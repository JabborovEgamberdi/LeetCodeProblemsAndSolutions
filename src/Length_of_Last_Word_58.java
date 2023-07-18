/*

    Problem:
  58. Length of Last Word
  Given a string s consisting of words and spaces, return the length of the last word in the string.
  A word is a maximal substring consisting of non-space characters only.

    Level:
  Easy

    Result:
  Successfully finished with runtime 0 ms
  Time Complexity:
       first way: O (n + m);
                     n - length of input string;
                     m - length of trimmed string;
       second way: O (1)

*/

public class Length_of_Last_Word_58 {

    public static void main(String[] args) {
        String word = "   fly me   to   the moon  ";
        System.out.println("lengthOfLastWord(word) = " + lengthOfLastWordFirstWay(word));
        String word1 = "  Hello World";
        System.out.println("lengthOfLastWordSecondWay(word1) = " + lengthOfLastWordSecondWay(word1));
    }

    public static int lengthOfLastWordFirstWay(String string) {
        StringBuilder finalString = new StringBuilder();
        String trim = string.trim();
        for (int i = trim.length() - 1; i >= 0; i--) {
            finalString.append(trim.charAt(i));
            if (String.valueOf(trim.charAt(i)).equals(" ")) {
                break;
            }
        }
        return finalString.toString().trim().length();
    }

    public static int lengthOfLastWordSecondWay(String string) {
        int length = 0;
        int index = string.length() - 1;
        while (index >= 0 && string.charAt(index) == ' ') {
            index--;
        }
        while (index >= 0 && string.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }

}