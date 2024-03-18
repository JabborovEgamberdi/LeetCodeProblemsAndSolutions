import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String_1047 {

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(STR."removeDuplicates(s) = \{removeDuplicates(s)}");
    }

    public static Stack<String> removeDuplicates(String s) {
        Stack<String> result = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            result.push(STR."\{s.charAt(i)}");
        }
        return result;
    }

}