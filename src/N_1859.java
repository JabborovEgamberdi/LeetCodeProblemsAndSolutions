import java.util.List;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Runtime: 0 ms, faster than 100.00% of Java online submissions for Sorting the Sentence.
*
* */
public class N_1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence1("is2 sentence4 This1 a3"));
        System.out.println(sortSentence1("Myself2 Me1 I4 and3"));
        System.out.println(sortSentence2("is2 sentence4 This1 a3"));
        System.out.println(sortSentence2("Myself2 Me1 I4 and3"));
    }

    // 0 ms
    private static String sortSentence1(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        String[] arr = new String[str.length + 1];
        for (String string : str) {
            int position = string.charAt(string.length() - 1) - '0';
            arr[position] = string.substring(0, string.length() - 1);
        }
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1) sb.append(arr[i]);
            else sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    // 3 ms
    private static String sortSentence2(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        String[] arr = new String[str.length + 1];
        for (int i = 0; i < str.length; i++) {
            String string = str[i].substring(str[i].length() - 1, str[i].length());
            System.out.println(string);
            int i1 = Integer.parseInt(string);
            arr[i1] = str[i].substring(0, str[i].length() - 1);
        }
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                sb.append(arr[i]);
            else
                sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

}
