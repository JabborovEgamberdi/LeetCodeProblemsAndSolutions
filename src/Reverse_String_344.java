import java.util.LinkedList;
import java.util.List;

//Done 0 ms --> 100 %
public class Reverse_String_344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString1(s);
        reverseString(s);

    }

    public static void reverseString(char[] s) {
        List<Character> list = new LinkedList<>();
        for (int i = s.length - 1; i >= 0; i--) {
            list.add(s[i]);
        }
        System.out.println(STR."list = \{list}");
    }

    public static void reverseString1(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            char temp1 = s[right];
            s[left] = temp1;
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
}
