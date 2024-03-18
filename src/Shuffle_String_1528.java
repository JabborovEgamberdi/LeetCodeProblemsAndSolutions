/*
* Level: Easy 🟢🟢🟢
* not done
* */
public class Shuffle_String_1528 {
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
        System.out.println(restoreString("abc", new int[]{0, 1, 2}));
        System.out.println(restoreString("aiohn", new int[]{3, 1, 4, 2, 0}));
        System.out.println(restoreString("art", new int[]{1, 0, 2}));
        System.out.println(restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder();
        for (int index : indices) {
            result.append(s.charAt(index));
        }
        return result.toString();
    }

}
