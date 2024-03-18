package NotFinished;

public class N_1071 {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        int index = 0;
        StringBuilder result = new StringBuilder();
        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                result.append(str1.charAt(index));
                if (result.length() == str2.length()) {
                    return result.toString();
                }
            } else result = new StringBuilder();
            index++;
        }
        return "";
    }

}
